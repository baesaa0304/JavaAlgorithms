package Array.algorithms11;


import java.io.*;
import java.util.*;


public class Main {
	int solution(int n , int[][] arr) {
		int answer = 1;
		int sameStudent = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			int cnt = 0;
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(sameStudent < cnt) {
				sameStudent = cnt;
				answer = i + 1;
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