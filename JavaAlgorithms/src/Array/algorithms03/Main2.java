package Array.algorithms03;

import java.io.*;
import java.util.*;

public class Main2 {
	ArrayList<String> solution(int[] a ,int[] b, int n) {
		ArrayList<String> answer = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			if(a[i] == b[i]) {
				answer.add("D");
			}
			else if(a[i] == 1 && b[i] == 3) {
				answer.add("A");
			}
			else if(a[i] == 2 && b[i] == 1) {
				answer.add("A");
			}
			else if(a[i] == 3 && b[i] == 2) {
				answer.add("A");
			}
			else {
				answer.add("B");
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException {
		Main2 obj = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A [] = new int[N]; // 2 3 3 1 3
		int B [] = new int[N]; // 1 1 2 2 3
		
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			A[i] = n;
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			B[i] = n;
		}
		for(String s : obj.solution(A , B, N)) {
			System.out.println(s);
		}
	}
}
 
 