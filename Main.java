import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        
        board.printBoard();
        //board.dropToken(0, 'x');
        //board.dropToken(1, 'y');
        //board.printBoard();

        while(true){
            System.out.print("Enter a column (-1 to end): ");
            int input = Integer.valueOf(scanner.nextLine());

            if(input == -1){
                break;
            }

            if(board.isValidMove(input)){
                board.dropToken(input, 'X');
                board.printBoard();
            } else{
                System.out.println("Invalid column!");
            }
            
        }
    }
}