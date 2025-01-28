package string.algorithms11;

import java.io.*;
import java.util.*;

public class Main {
    String solution(String s) {
    	String answer = " ";
    	StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			//System.out.println("c = " + c);
			int count = 1;
			while (i + 1 < s.length() && c == s.charAt(i + 1)) {
				//System.out.println("s.charAt(i) = " + s.charAt(i));
				count++;
				i++;
			}
			sb.append(c);
			if(count > 1) {
				sb.append(String.valueOf(count));
			}
			
			
		}
		//System.out.println(sb.toString());
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
 