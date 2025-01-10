import java.io.*;

public class Main {
    static int N;
    static int[] queens; // 각 행의 퀸 위치를 저장
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        queens = new int[N];
        solveNQueens(0); // 0번째 행부터 시작
        System.out.println(count);
    }

    public static void solveNQueens(int row) {
        if (row == N) { // 모든 행에 퀸을 배치한 경우
            count++;
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) { // 현재 위치에 퀸을 놓을 수 있으면
                queens[row] = col; // 퀸 배치
                solveNQueens(row + 1); // 다음 행으로 이동
                queens[row] = 0; // 백트래킹: 퀸 제거
            }
        }
    }

    public static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(row - i) == Math.abs(col - queens[i])) {
                return false; // 같은 열 or 대각선에 퀸이 있음
            }
        }
        return true;
    }
}
