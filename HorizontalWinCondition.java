public class HorizontalWinCondition implements WinConditionStrategy{
    
    @Override
    public boolean checkForWin(char[][] array, char symbol){
        
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length - 3; col++){
                if(array[row][col] == symbol &&
                    array[row][col + 1] == symbol &&
                    array[row][col + 2] == symbol &&
                    array[row][col + 3] == symbol){
                        return true;
                    }
            }
        }
        return false;
    } 
}
