package string.algorithms09;

import java.io.*;
import java.util.*;

public class Main {
    int solution(String s) {
    	int answer = 0;
    	StringBuilder sb = new StringBuilder();
    	for(Character c :s.toCharArray()) {
    		if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
    			continue;
    		}
    		else {
    			sb.append(c);
    		}
    	}
    	//System.out.println(sb.toString().valueOf(sb);
    	answer = Integer.parseInt(sb.toString());
    	//System.out.println(answer);
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
 