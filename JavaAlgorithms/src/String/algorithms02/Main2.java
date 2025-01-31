package String.algorithms02;


import java.io.*;

public class Main2 {
	
	public String solution(String s) {
		String answer = "";
		for(Character c : s.toCharArray()) {
			if(Character.isLowerCase(c)) {
				answer += Character.toUpperCase(c);
			}
			else {
				answer += Character.toLowerCase(c);
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
 