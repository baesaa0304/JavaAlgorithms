package TwoPointers_SlidingWindow.algorithmss05;

import java.io.*;
import java.util.*;

public class Main {
	
	int solution(int n , int arr[]) {
		int answer = 0;
		for(int i = 0; i < n; i++) {
			int sum = arr[i];
			System.out.println("---------------------");
			System.out.println("sum = " + sum);
			for(int j = i + 1; j < n; j++) {
				
				sum+= arr[j];
				System.out.println("j = " + arr[j]);
				System.out.println("sum = " + sum);
				if(sum == n) {
					answer++;
					System.out.println("answer = "  + answer);
					break;
				}
				else if(sum > n) {
					break;
				}
			}
			
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] =  new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		System.out.println(obj.solution(N, arr));
	}

}
 