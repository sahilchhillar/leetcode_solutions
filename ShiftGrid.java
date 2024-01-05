public class ShiftGrid {
    public static void shiftGrid(int[][] grid, int k){
        int row = grid.length, col = grid[0].length;
        if(k % (row * col) == 0){
            return;
        }

        k %= (row * col);
        
    }

    public static void main(String[] args) {
        
    }
}
