package Array.algorithms06;

import java.io.*;
import java.util.*;

public class Main {
	 static boolean isPrime(int num) {
	        if (num < 2) return false; // 0과 1은 소수가 아님
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) return false; // 나누어 떨어지면 소수 아님
	        }
	        return true;
	    }
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		 List<Integer> result = new ArrayList<>();
		 for (int i = 0; i < N; i++) {
			 StringBuilder sb = new StringBuilder(st.nextToken()).reverse();
	         int reversedNumber = Integer.parseInt(sb.toString()); // 앞의 0 자동 제거
	         
	         if (isPrime(reversedNumber)) {
	                result.add(reversedNumber);
	            }	
	            
	        
		 }
		 for (int num : result) {
			 System.out.print(num + " ");
	   }
		
	}
}
 