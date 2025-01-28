package string.algorithms12;

import java.io.*;

public class Main {
    String solution(int n ,String s) {
    	String answer = " ";
    	for(int i = 0; i < n; i ++) {
    		String tmp = s.substring(0 , 7).replace('#', '1').replace('*', '0');
    		int num = Integer.parseInt(tmp , 2);
    		answer += (char) num;
//    		System.out.println(num);
    		 s = s.substring(7);
    	}

        return answer.trim();
    }

	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String word = br.readLine(); 
		System.out.println(obj.solution( n , word)); 

		br.close();
	}
}
 