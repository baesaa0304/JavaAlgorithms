package Array.algorithms02;

import java.io.*;
import java.util.*;

public class Main {
	int solution(int[] number , int n) {
		int answer = 1;
		int tall = number[0];
		for(int i = 1; i < n; i++) {
			if(tall < number[i]) {
				answer++;
				tall = number[i];
			}
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int number[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			number[i] = n;
		}
		
		System.out.println(obj.solution(number, N));
	}
}