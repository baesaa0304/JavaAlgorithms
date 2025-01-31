package Array.algorithms08;

import java.io.*;
import java.util.*;

public class Main {
	 int[] solution(int n , int[] num) {
		int answer[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			int idx = 1;
			for(int j = 0; j < n; j++) {
				if(num[j] > num[i]) {
					idx++;
				}
			}
			answer[i] = idx;
		}
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int number[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		for(int i : obj.solution(N, number)) {
			System.out.print(i + " ");
		}
		
		
	}
}