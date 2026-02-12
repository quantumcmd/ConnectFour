import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Player p1 = new Player("Tom", 'T');
        Player p2 = new Player("Jerry", 'J');

        board.printBoard();

        Player currentPlayer = p1;

        while(true){
            System.out.println(currentPlayer.getPlayerName() + "'s turn");
            System.out.print("Enter a column (0-5) OR -1 to end: ");

            //Discard bad input
            if(!scanner.hasNextInt()){
                scanner.next();
                continue;
            }
            int input = Integer.valueOf(scanner.nextLine());

            if(input == -1){
                break;
            }

            if(board.isValidMove(input)){
                board.dropToken(input, currentPlayer.getPlayerSymbol());
                board.printBoard();

                if(currentPlayer == p1){
                    currentPlayer = p2;
                }else{
                    currentPlayer = p1;
                }
            } else{
                System.out.println("Invalid move!");
            }
            
        }
    }
}