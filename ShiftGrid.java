import java.util.ArrayList;
import java.util.List;

public class ShiftGrid {
    public static void shiftGrid(int[][] grid, int k){
        int row = grid.length, col = grid[0].length;

        k %= (row * col);
        for(int i=0; i<k; i++){
            int[] temp = new int[row];
            int s = 0;
            for(int r=0; r<row; r++){
                temp[s++] = grid[r][col-1];
                for(int c=col-2; c>=0; c--){
                    grid[r][c+1] = grid[r][c];
                }
            }

            // changing the first column
            grid[0][0] = temp[row-1];
            for(int r=1; r<row; r++){
                grid[r][0] = temp[r-1];
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<row; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<col; j++){
                list.add(grid[i][j]);
            }
            res.add(list);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
            {3,8,1,9} , {19,7,2,5}, {4,6,11,10}, {12,0,21,13}
        };
        int k = 4;
        shiftGrid(grid, k);
    }
}
