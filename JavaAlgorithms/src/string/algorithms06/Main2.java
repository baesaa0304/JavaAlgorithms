package string.algorithms06;

import java.io.*;
import java.util.*;

public class Main2 {
    // 문자열 뒤집는 메서드
    String solution(String s) {
    	String answer = "";
    	for(int i = 0; i < s.length(); i++) {
    		System.out.println(s.charAt(i)+" "+i+" "+s.indexOf(s.charAt(i)));
    		if(s.indexOf(s.charAt(i)) == i) {
    			answer+=s.charAt(i);
    		}
    	}
        return answer;
    }

	public static void main(String[] args) throws IOException {
		Main2 obj = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String word = br.readLine(); 
		System.out.println(obj.solution(word)); 

		br.close();
	}
}
 