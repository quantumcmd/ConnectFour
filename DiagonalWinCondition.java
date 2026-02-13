public class DiagonalWinCondition implements WinConditionStrategy {
    
    @Override
    public boolean checkForWin(char[][] array, char symbol){

        // Check for ascending dioginal 
        for(int row = 3; row < array.length; row++){
            for(int col = 0; col < array[row].length - 3; col++){
                if(array[row][col] == symbol &&
                    array[row - 1][col + 1] == symbol &&
                    array[row - 2][col + 2] == symbol &&
                    array[row - 3][col + 3] == symbol){
                    return true;
                }
            }
        }

        // Check for descending diagonal
        for(int row = 0; row < array.length - 3; row++){
            for(int col = 0; col < array[row].length - 3; col++){
                if(array[row][col] == symbol &&
                    array[row + 1][col + 1] == symbol &&
                    array[row + 2][col + 2] == symbol &&
                    array[row + 3][col + 3] == symbol){
                        return true;
                    }
            }
        }
        return false;
    } 
}
