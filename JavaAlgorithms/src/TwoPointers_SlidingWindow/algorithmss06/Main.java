package TwoPointers_SlidingWindow.algorithmss06;

import java.io.*;
import java.util.*;

public class Main {
	
	int solution(int n , int m ,int arr[]) {
		int answer = Integer.MIN_VALUE;
		int cnt = 0, lt = 0 ;
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				cnt++;
			}
			while(cnt > m) {
				if(arr[lt] == 0) {
					cnt--;
				}
				lt++;
			}
			answer = Math.max(answer, i - lt + 1);
			
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] =  new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(obj.solution(N, M ,arr));
	}

}
 