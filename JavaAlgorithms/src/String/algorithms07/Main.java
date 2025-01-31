package String.algorithms07;

import java.io.*;
import java.util.*;

public class Main {
    String solution(String s) {
    	String answer = "";
    	s = s.toLowerCase();
    	StringBuilder sb = new StringBuilder(s).reverse();
    	if(s.equals(sb.toString())) {
    		answer  = "YES";
    	}  
    	else {
    		answer = "NO";
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
 