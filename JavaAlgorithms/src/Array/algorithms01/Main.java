package Array.algorithms01;

import java.io.*;
import java.util.*;


public class Main {
	
	ArrayList<Integer> solution(int[] number , int n) {
	
		ArrayList<Integer> list = new ArrayList<>();
		 list.add(number[0]);
		for(int i = 1; i < n; i++){
			if(number[i] > number[i - 1]) {
				list.add(number[i]);
			}
			
		}
		  return list;
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
		for(int i : obj.solution(number, N)) {
			System.out.print(i + " ");
		}

	}

}
 