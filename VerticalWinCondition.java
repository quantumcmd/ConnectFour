public class VerticalWinCondition implements WinConditionStrategy{
    
    @Override
    public boolean checkForWin(char[][] array, char symbol){

        for(int col = 0; col < array[0].length; col++){
            for(int row = 0; row < array.length - 3; row++){
                if(array[row][col] == symbol && 
                    array[row + 1][col] == symbol &&
                    array[row + 2][col] == symbol && 
                    array[row + 3][col] == symbol){
                        return true;
                    }
            }
        }
        return false;
    } 
}
