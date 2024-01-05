import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static boolean validRow(char[][] board){
        boolean isValidRow = true;
        for(int i=0; i<board.length; i++){
            if(!isValid(board[i])){
                isValidRow = false;
                break;
            }
        }
        return isValidRow;
    }

    public static boolean validColumn(char[][] board){
        boolean isValidColumn = true;
        for(int i=0; i<board[0].length; i++){
            char[] column = new char[board[0].length];
            for(int j=0; j<board.length; j++){
                column[j] = board[j][i];
            }
            if(!isValid(column)){
                isValidColumn = false;
                break;
            }
        }
        return isValidColumn;
    }

    public static boolean isValid(char[] row){
        Set<Character> set = new HashSet<>();
        for(Character ch : row){
            if(ch != '.'){
                if(set.contains(ch)){
                    return false;
                }
                set.add(ch);
            }
        }
        return true;
    }

    public static boolean validSudoku(char[][] board){
        return validRow(board) && validColumn(board);
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{

        };
    }
}
