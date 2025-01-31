package String.algorithms12;

import java.io.*;

public class Main2 {
    String solution(int n ,String s) {
    	String answer = " ";
    	for(int i = 0; i < n; i ++) {
    		String tmp = s.substring(0 , 7);
    		StringBuilder sb = new StringBuilder();
    		for(Character c : tmp.toCharArray()) {
    			if(c.equals('#')) sb.append('1');
    			else sb.append('0');
    			//System.out.println(sb.toString());
    			
    		}
    		int num = Integer.parseInt(sb.toString() , 2);
			answer += (char) num;
			//System.out.println(sb.toString());
    		s = s.substring(7);
    	}

        return answer.trim();
    }

	public static void main(String[] args) throws IOException {
		Main2 obj = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String word = br.readLine(); 
		System.out.println(obj.solution( n , word)); 

		br.close();
	}
}
 