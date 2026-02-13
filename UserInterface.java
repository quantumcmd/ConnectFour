import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Board board;
    private Player player1;
    private Player player2;

    public UserInterface(Scanner scanner, Board board, Player player1, Player player2){
        this.scanner = scanner;
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(){
        board.printBoard();

        Player currentPlayer = this.player1;

        while(true){
            System.out.println(currentPlayer.getPlayerName() + "'s turn");
            System.out.print("Enter a column (0-5) OR -1 to end: ");

            //Discard bad input
            if(!scanner.hasNextInt()){
                scanner.next();
                continue;
            }
            int input = scanner.nextInt();

            if(input == -1){
                break;
            }

            if(board.isValidMove(input)){
                board.dropToken(input, currentPlayer.getPlayerSymbol());
                board.printBoard();
                if(board.hasWinner(currentPlayer.getPlayerSymbol())){
                    System.out.println("CONGRATULATIONS!!! " + currentPlayer.getPlayerName() + " HAS WON!!!");
                    break;
                } else if(board.isBoardFull()){
                    System.out.println("TIE");
                    break;
                }

                if(currentPlayer == player1){
                    currentPlayer = player2;
                }else{
                    currentPlayer = player1;
                }
            } else{
                System.out.println("Invalid move!");
            }
            
        }
    }
}
