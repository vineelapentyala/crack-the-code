import java.util.*;

public class ZeroMatrix {
    public static void zeroMatrix(int[][] matrix){
        List<Integer> zeroRows = new ArrayList<>();
        List<Integer> zeroCols = new ArrayList<>();
        //walk through the matrix and note row and column indices for elements that are zero
        for (int i = 0; i < matrix.length;i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }
        for (int row: zeroRows){
            for (int j = 0; j < matrix[0].length;j++){
                matrix[row][j] = 0;
            }
        }
        for (int col: zeroCols){
            for (int i = 0; i < matrix[0].length;i++){
                matrix[i][col] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] test = {{1,0,3}, {2, 1, 2}, {4,1,4}};
        zeroMatrix(test);
        for (int i = 0; i < test.length; i++){
            for (int j = 0; j < test[0].length; j++){
                System.out.print(test[i][j]+", ");
            }
            System.out.println();
        }
    }
}
