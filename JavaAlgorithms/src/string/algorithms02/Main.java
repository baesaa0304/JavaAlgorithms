package string.algorithms02;

import java.io.*;

public class Main {
	public String solution(String s) {
		String answer = "";
		for(Character c : s.toCharArray()) {
			if(c >= 97 && c<= 122) {
				answer +=(char)(c - 32);			
			}
			else {
				answer +=(char)(c + 32);		
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
 