import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6}};
        int[][] transpose = new int[3][2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < transpose.length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matrix :");
        for (int[] value : matrix) {
            System.out.println(Arrays.toString(value));
        }
        System.out.println("Transpose :");
        for (int[] ints : transpose) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
