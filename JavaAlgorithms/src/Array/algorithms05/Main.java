package Array.algorithms05;

import java.io.*;
import java.util.*;

public class Main {
	int solution(int n) {
		int answer = 0;
		int [] isParam = new int[n+1];
		for(int i = 2; i< n; i++) {
			if(isParam[i] == 0) {
				answer++;
			}
			for(int j = i; j <= n; j = j+i) {
				isParam[j] = 1;
			}
			
		
		}
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.print(obj.solution(N));
		
	}
}
 