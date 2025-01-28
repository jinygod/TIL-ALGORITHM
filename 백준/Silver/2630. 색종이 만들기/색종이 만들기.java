import java.util.*;
import java.io.*;

public class Main {
    public static int white = 0; // 흰색 종이 개수
    public static int blue = 0; // 파란색 종이 개수

    public static void dfs(int[][] area, int x, int y, int size) {
        // 현재 영역이 모두 같은 색인지 확인
        if (isSameColor(area, x, y, size)) {
            if (area[x][y] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        // 영역을 4등분하여 재귀적으로 처리
        int newSize = size / 2;
        dfs(area, x, y, newSize); // 1사분면
        dfs(area, x, y + newSize, newSize); // 2사분면
        dfs(area, x + newSize, y, newSize); // 3사분면
        dfs(area, x + newSize, y + newSize, newSize); // 4사분면
    }

    // 현재 영역이 모두 같은 색인지 확인하는 함수
    public static boolean isSameColor(int[][] area, int x, int y, int size) {
        int color = area[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (area[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] area = new int[N][N];

        // 입력 처리
        for (int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                area[i][j] = Integer.parseInt(temp[j]);
            }
        }

        // 재귀 호출 시작
        dfs(area, 0, 0, N);

        // 결과 출력
        System.out.println(white); // 흰색 종이 개수
        System.out.println(blue);  // 파란색 종이 개수
    }
}
