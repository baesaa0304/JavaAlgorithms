package string.algorithms10;

import java.io.*;
import java.util.*;

public class Main {
    int[] solution(String s , char c) {
    	int answer[] = new int[s.length()]; 
    	int p = 1000;
    	for(int i = 0; i < s.length(); i++) {
    		if(s.charAt(i) == c) {
    			p = 0;
    			answer[i] = p;
    		}
    		else {
    			p++;
    			answer[i]=p;
    		}
    	}
    	p = 1000;
    	for(int i = s.length() - 1; i >= 0; i--) {
    		if(s.charAt(i) == c) {
    			p = 0;
    			answer[i] = p;
    		}
    		else {
    			p++;
    			answer[i]=Math.min(answer[i] , p);
    		}
    	}
        return answer;
    }

	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String word = st.nextToken();
		char find = st.nextToken().charAt(0);
		
		for(int x : obj.solution(word , find)) {
			System.out.print(x + " ");
		}

		br.close();
	}
}
 