package Array.algorithms11;


import java.io.*;
import java.util.*;


public class Main2 {
    int solution(int n, int[][] arr) {
    	 int answer = 0, max = 0;
         for (int i = 1; i <= n; i++) {
             int cnt = 0;
             for (int j = 1; j <= n; j++) {
                 for (int k = 1; k <= 5; k++) {
                     if (arr[i][k] == arr[j][k]) {
                         cnt++;
                         break;
                     }
                 }
             }
             if (cnt > max) {
                 max = cnt;
                 answer = i;
             }
         }
         return answer;
     }

     public static void main(String[] args) throws IOException {
         Main2 obj = new Main2();
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;

         // 첫 번째 입력 (학생 수 n)
         int n = Integer.parseInt(br.readLine());
         int[][] arr = new int[n + 1][6]; // 1-based index 사용

         // 각 학생의 학습 활동 정보 입력
         for (int i = 1; i <= n; i++) {
             st = new StringTokenizer(br.readLine());
             for (int j = 1; j <= 5; j++) {
                 arr[i][j] = Integer.parseInt(st.nextToken());
             }
         }

         // 결과 출력
         System.out.print(obj.solution(n, arr));
     }
 }