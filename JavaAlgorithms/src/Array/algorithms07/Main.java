package Array.algorithms07;

import java.io.*;
import java.util.*;

public class Main {
	 int solution(int n , int[] num) {
		int answer = 0;
		int tmp = 0;
		for(int i = 0; i < n; i++) {
			
			if(num[i] == 1) {
				tmp++;
				answer += tmp;
			} 
			else {
				tmp = 0;
				
			}
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
		System.out.println(obj.solution(N, number));
		
	}
}