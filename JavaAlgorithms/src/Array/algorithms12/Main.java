package Array.algorithms12;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) { // 멘토 후보
            for (int j = 1; j <= n; j++) { // 멘티 후보
                if (i == j) continue; // 멘토와 멘티는 같을 수 없음
                int cnt = 0;

                for (int k = 0; k < m; k++) { // 테스트 개수만큼 반복
                    int pi = 0, pj = 0;

                    for (int s = 0; s < n; s++) { // 각 테스트에서 순위 찾기
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }

                    if (pi < pj) cnt++; // 멘토(i)의 순위가 멘티(j)보다 높아야 함
                }

                if (cnt == m) answer++; // 모든 테스트에서 i가 j보다 높은 경우만 카운트
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main obj = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.print(obj.solution(n, m, arr));
    }
}