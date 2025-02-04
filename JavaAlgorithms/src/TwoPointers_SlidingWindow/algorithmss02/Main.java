package TwoPointers_SlidingWindow.algorithmss02;

import java.io.*;
import java.util.*;

public class Main {
	ArrayList<Integer> solution(	int n , int m , int arr[] , int arr2[]) {
		ArrayList<Integer> answer = new ArrayList<>();	
		Arrays.sort(arr); 
		Arrays.sort(arr2); 
		 int p1 = 0, p2 = 0;
	        while (p1 < n && p2 < m) {
	            if (arr[p1] == arr2[p2]) {  // 같은 원소 발견
	                answer.add(arr[p1]);
	                p1++;  // 다음 요소로 이동
	                p2++;
	            } else if (arr[p1] < arr2[p2]) {  
	                p1++;  // 작은 값 쪽 포인터 증가
	            } else {
	                p2++;
	            }
	        }
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
 