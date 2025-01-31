package Array.algorithms04;

import java.io.*;
import java.util.*;

public class Main {
	int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = answer[0];
		for(int i = 2; i < n; i++) {
			answer[i] = answer[i - 1] + answer[i - 2];
//			System.out.println(answer[i]);
		}
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int s : obj.solution(N)) {
			System.out.print(s + " ");
		}
	}
}
 