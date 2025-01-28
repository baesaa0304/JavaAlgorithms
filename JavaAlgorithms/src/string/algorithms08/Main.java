package string.algorithms08;

import java.io.*;
import java.util.*;

public class Main {
    String solution(String s) {
    	String answer = "YES";
    	StringBuilder sb = new StringBuilder();
		for(Character c : s.toCharArray()) {
			if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
				sb.append(Character.toLowerCase(c));
			}
		}
		String word = sb.toString();
		String word2 = sb.reverse().toString();
		
		if(!word.equals(word2)) {
			 answer = "NO";
			 return answer;
		}
        return answer;
    }

	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String word = br.readLine(); 
		// 입력 : found7, time: study; Yduts; emit, 7Dnuof
		System.out.println(obj.solution(word)); 

		br.close();
	}
}
 