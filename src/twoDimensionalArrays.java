import java.util.*;
public class twoDimensionalArrays {
    public static void main(String[] args) {
        int[][] mT = new int[5][10];
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 9; j++) {
                mT[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int row = 0; row < mT.length; row++) {
            for (int column = 0; column < mT[row].length; column++) {
                System.out.print(mT[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
