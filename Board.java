public class Board {
    private final int ROWS = 5;
    private final int COLS = 6;
    private char[][] array = new char[ROWS][COLS];
    private HorizontalWinCondition hWC = new HorizontalWinCondition();
    private VerticalWinCondition vWC = new VerticalWinCondition();
    private DiagonalWinCondition dWC = new DiagonalWinCondition();

    public Board(){
        initBoard();
    }

    private void initBoard(){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = '-';
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
        if(isValidMove(column)){
            for(int i = ROWS-1; i >= 0; i--){
                if(array[i][column] == '-'){
                    array[i][column] = symbol;
                    break;
                }
            }
        }
    }

    public boolean isValidMove(int column){
        if(column < 0 || column >= COLS){
            return false;
        }
        if(array[0][column] != '-'){
            return false;
        }
        return true;
    }

    public boolean hasWinner(char symbol){
        if(hWC.checkForWin(array, symbol) 
            || vWC.checkForWin(array, symbol) 
            || dWC.checkForWin(array, symbol)){
                return true;
            }
        return false;
    }

    public boolean isBoardFull(){

        for(int col = 0; col < array[0].length; col++){
            if(array[0][col] == '-'){
                return false;
            }
        }
        return true;
    }
}
