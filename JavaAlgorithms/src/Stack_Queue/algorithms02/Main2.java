package Stack_Queue.algorithms02;


import java.io.*;
import java.util.*;

/**
 * 알파벳과 여는 괄호를 넣어줌. 만약 닫는 괄호를 만나는 경우 뺴주면 되는 문제.
 */
public class Main2 {
	public static void main(String[] args) throws IOException {
		Main2 obj = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(obj.solution(s));

	}
	String solution(String s) {
		String answer = "";
		
		Stack<Character> stack = new Stack<>();
		for(Character c : s.toCharArray()) {
			if(c.equals(')')) {
				while(stack.pop()!='(');
			}
			else {
				stack.push(c);
			}
		}
		for(int i=0; i<stack.size(); i++) {
			answer+=stack.get(i);
		}
		return answer;
	}
	
}
 