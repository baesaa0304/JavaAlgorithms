package TwoPointers_SlidingWindow.algorithmss04;

import java.io.*;
import java.util.*;

public class Main2 {
	
	int solution(int n , int m , int arr[]) {
		int answer = 0;
		for(int i = 0; i < n; i++) {
			int sum = arr[i];
			System.out.println("---------------------");
			System.out.println("sum = " + sum);
			for(int j = i + 1; j < n; j++) {
				
				sum+= arr[j];
				System.out.println("j = " + arr[j]);
				System.out.println("sum = " + sum);
				if(sum == m) {
					answer++;
					System.out.println("answer = "  + answer);
					break;
				}
				else if(sum > m) {
					break;
				}
			}
			
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		Main2 obj = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] =  new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		System.out.println(obj.solution(N, M, arr));
	}

}
 