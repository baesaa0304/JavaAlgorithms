package Array.algorithms10;


import java.io.*;
import java.util.*;


public class Main {
	int solution(int n , int[][] arr) {
		int answer = 0;
        int[] dx = {-1, 1, 0, 0}; 
        int[] dy = {0, 0, -1, 1}; 

        // 모든 위치(i, j)에 대해 봉우리 여부 검사
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isPeak = true; // 봉우리 여부

                // 상하좌우 비교
                for (int d = 0; d < 4; d++) {
                    int nx = i + dx[d];
                    int ny = j + dy[d];

                    // 배열 범위를 벗어나지 않는 경우만 비교
                    if (nx >= 0 &&ny >= 0 && nx < n && ny < n) {
                        if (arr[i][j] <= arr[nx][ny]) {
                            isPeak = false; 
                            break;
                        }
                    }
                }

                // 봉우리라면 카운트 증가
                if (isPeak) {
                    answer++;
                }
            }
        }
        return answer;
    }
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int number[][] = new int[N][N];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				number[i][j] = Integer.parseInt(st.nextToken());
			}
			
		}
		System.out.println(obj.solution(N, number));
	}

}
 