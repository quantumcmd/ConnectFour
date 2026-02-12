public class Board {
    private final int ROWS = 5;
    private final int COLS = 6;
    private char[][] array = new char[ROWS][COLS];;

    public Board(){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = ' ';
            }
        }
    }

    public void printBoard(){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void dropToken(int column, char symbol){
        //Gravity logic
        for(int i = ROWS-1; i >= 0; i++){
            if(array[i][column] == ' '){
                array[i][column] = symbol;
                break;
            }
        }
    }
}
