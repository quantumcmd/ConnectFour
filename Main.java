import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Player p1 = new Player("Tom", 'T');
        Player p2 = new Player("Jerry", 'J');
        UserInterface ui = new UserInterface(scanner, board, p1, p2);

        ui.start();
    }
}
