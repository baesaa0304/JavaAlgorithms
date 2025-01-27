package string.algorithms03;

import java.io.*;

public class Main {
	String solution(String s) {
		String answer = "";
		int maxString = Integer.MIN_VALUE;
		String word[] = s.split(" "); // String 공백 기준으로 넣음 
		for(String x : word) {
			int len = x.length();
			if(maxString < len) {
				maxString = len;
				answer = x;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		System.out.println(obj.solution(word));
		br.close();

	}
}
 