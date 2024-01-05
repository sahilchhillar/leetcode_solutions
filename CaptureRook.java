public class CaptureRook {
    public static int captureRook(char[][] board){
        int r = -1, c = -1;
        int pawns = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'R'){
                    r = i; c = j; break;
                }
            }
        }

        // Move to the left
        for(int i=c; i>=0; i--){
            if(board[r][i] != '.'){
                if(board[r][i] == 'B'){
                    break;
                }if(board[r][i] == 'p'){
                    pawns++; break;
                }
            }
        }

        // Move to the right
        for(int i=c; i<board[0].length; i++){
            if(board[r][i] != '.'){
                if(board[r][i] == 'B'){
                    break;
                }if(board[r][i] == 'p'){
                    pawns++; break;
                }
            }
        }

        // Move up
        for(int i=r; i>=0; i--){
            if(board[i][c] != '.'){
                if(board[i][c] == 'B'){
                    break;
                }if(board[i][c] == 'p'){
                    pawns++; break;
                }
            }
        }

        // Move down
        for(int i=r; i<board.length; i++){
            if(board[i][c] != '.'){
                if(board[i][c] == 'B'){
                    break;
                }if(board[i][c] == 'p'){
                    pawns++; break;
                }
            }
        }

        return pawns;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{};
        captureRook(board);
    }
}
