package TwoPointers_SlidingWindow.algorithmss03;

import java.io.*;
import java.util.*;


public class Main {
	
	int solution(int n , int m , int arr[]) {
		int answer = Integer.MIN_VALUE;
		int sum = 0;

		// 초기 K개의 합 구하기
		for (int i = 0; i < m; i++) {
			sum += arr[i];
		}
		answer = sum;

		// 슬라이딩 윈도우 적용
		for (int i = m; i < n; i++) {
			sum += arr[i];      // 새로운 값 추가
			sum -= arr[i - m];  // 이전 윈도우의 첫 번째 값 제거
			answer = Math.max(answer, sum);
		}

		return answer;
	}
	
	
	public static void main(String[] args) throws IOException{
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int [N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(obj.solution(N, M, arr));
	}

}
 