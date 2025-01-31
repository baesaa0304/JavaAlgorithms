package Array.algorithms05;

import java.io.*;
import java.util.*;

public class Main2 {
	int solution(int n) {
		int answer = 0;
		boolean [] isPrime = new boolean[n+1];
		 Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false; 
		for (int i = 2; i * i <= n; i++) { 
            if (isPrime[i]) { 
                for (int j = i * i; j <= n; j += i) { 
                    isPrime[j] = false;
                }
            }
        }
		for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
            	answer++;
            }
        }
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException {
		Main2 obj = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.print(obj.solution(N));
		
	}
}
 