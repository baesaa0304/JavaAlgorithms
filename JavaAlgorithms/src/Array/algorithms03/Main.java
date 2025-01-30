package Array.algorithms03;

import java.io.*;
import java.util.*;

public class Main {
	ArrayList<String> solution(int[] a ,int[] b, int n) {
		ArrayList<String> answer = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			if(a[i] < b[i]) {
				if(a[i] == 1 && b[i] == 3) {
					answer.add("A");
				}
				else {
					answer.add("B");
				}
				
			}
			else if(a[i] > b[i]){
				if(a[i] == 3 && b[i] == 1) {
					answer.add("B");
				}
				else {
					answer.add("A");
				}
			}
			
			else if(a[i] == b[i]){
				answer.add("D");
			}
			
		}
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
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
 