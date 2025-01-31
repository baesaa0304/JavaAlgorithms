package String.algorithms04;

import java.io.*;

public class Main {
	String solution(String s) {
		String answer = "";
		StringBuilder sb = new StringBuilder(s).reverse();
		answer = sb.toString();
		//System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i =0; i < T; i++) {
			String word = br.readLine();
			System.out.println(obj.solution(word));
		}
		br.close();

	}
}
 