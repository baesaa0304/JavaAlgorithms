package string.algorithms01;

import java.io.*;

public class Algorithms01 {
	
	public int solution(String s , char c) {  
		int answer = 0;
		 s = s.toUpperCase();
		 c = Character.toUpperCase(c);
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {  // char 값끼리 비교
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		Algorithms01 obj = new Algorithms01();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String word  = br.readLine();
		char find = br.readLine().charAt(0);
		
		System.out.print(obj.solution(word, find));
		br.close();
	}
}