package Array.algorithms09;

import java.io.*;
import java.util.*;

public class Main {
	 int solution(int n , int[][] num) {
		int answer = Integer.MIN_VALUE;
		int sum1 , sum2;
		// 가로 길이 최대 합 큰거 
		for (int i = 0; i < n; i++) {
			sum1 = 0;
			sum2 = 0;
	        for (int j = 0; j < n; j++) {
	        	sum1 += num[i][j];
	        	sum2 += num[j][i]; 
	        }
	       answer = Math.max(sum1, answer);
	       answer = Math.max(sum2, answer);
	    }
		sum1 = 0;
		sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum1 += num[i][i];
			sum2 += num[i][n - 1 - i];   
		}
		answer = Math.max(sum1, answer);
		answer = Math.max(sum1, answer);
		
		
		
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