import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        final String[] inputLine01 = br.readLine().split(" ");

        final int sizeRow = Integer.parseInt(inputLine01[0]);
        final int sizeCol = Integer.parseInt(inputLine01[1]);

        final int[][] matrixA = inputMatrix(sizeRow, sizeCol);
        final int[][] matrixB = inputMatrix(sizeRow, sizeCol);

        final int[][] matrixSum = addMatrices(matrixA, matrixB, sizeRow, sizeCol);
        printMatrix(matrixSum, sizeRow, sizeCol);
    }

    private static void printMatrix(int[][] matrixSum, int sizeRow, int sizeCol) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                sb.append(matrixSum[i][j]).append(" ");
            }
            sb.setLength(sb.length() - 1);
            sb.append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }

    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB, int sizeRow, int sizeCol) {
        int[][] newMatrix = new int[sizeRow][sizeCol];
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                newMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return newMatrix;
    }

    private static int[][] inputMatrix(int sizeRow, int sizeCol) throws IOException {
        int[][] newMatrix = new int[sizeRow][sizeCol];
        for (int i = 0; i < sizeRow; i++) {
            final String[] inputLine = br.readLine().split(" ");
            for (int j = 0; j < sizeCol; j++) {
                newMatrix[i][j] = Integer.parseInt(inputLine[j]);
            }
        }
        return newMatrix;
    }
}