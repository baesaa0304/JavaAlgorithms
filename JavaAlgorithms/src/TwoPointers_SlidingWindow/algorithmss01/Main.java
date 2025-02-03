package TwoPointers_SlidingWindow.algorithmss01;

import java.io.*;
import java.util.*;

public class Main {

	ArrayList<Integer> solution(int n , int m , int arr[] , int arr2[]) {
		ArrayList<Integer>  answer = new ArrayList<>();
		for(int i= 0; i < n; i++) {
			answer.add(arr[i]);
		}
		for(int i= 0; i < m; i++) {
			answer.add(arr2[i]);
		}
		Collections.sort(answer);
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int arr2[] = new int[M];
		for(int i = 0; i < M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		for(int i : obj.solution(N, M, arr, arr2)) {
			System.out.print(i + " ");
		}
	}

}
 