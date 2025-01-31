package String.algorithms06;

import java.io.*;
import java.util.*;

public class Main {
    // 문자열 뒤집는 메서드
    String solution(String s) {
    	String answer = "";
    	LinkedHashSet<Character> word = new LinkedHashSet<>();
    	for(Character x : s.toCharArray()) {
    		word.add(x);
    	}
    	StringBuilder sb = new StringBuilder();
        for (Character c : word) {
            sb.append(c);
        }
    	answer = sb.toString();
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
 