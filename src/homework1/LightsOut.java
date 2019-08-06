package homework1;

import java.util.Random;

/**
 *
 * @author prakash
 */
public class LightsOut {

    private final boolean[][] grid;
    private final int ROWS;
    private final int COLS;

    public LightsOut(int row, int col) {
        grid = new boolean[row][col];
        ROWS = row;
        COLS = col;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                grid[i][j] = false;
            }
        }

        //NOW, toggle the light many times randomly
        Random rand = new Random();
        final int NUM_OF_TOGGLE = 40;
        for (int i = 0; i < NUM_OF_TOGGLE; i++) {
            move(rand.nextInt(row), rand.nextInt(col));
           // move(row, col);

        }
    }

    public boolean over() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j] == true) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String config = "  ";
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                config += (" " + toString(i, j) + " ");

            }
            config += "\n";

        }
        return config;
    }

    /**
     * return a string representing the content of cell (r,c) of the grid
     *
     */
    private String toString(int r, int c) {
        if (grid[r][c] == false) {
            return " -";
        } else {
            return " #";
        }
    }
    public final void move(int row, int  col) {
        toggle(row,col);
        toggle(row-1,col);
        toggle(row+1,col);
        toggle(row,col+1);
        toggle(row,col-1);
    }
    private void toggle(int row, int col) {
        grid[row][col] = !grid[row][col];
    }
}
