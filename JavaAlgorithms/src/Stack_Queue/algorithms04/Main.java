package Stack_Queue.algorithms04;

import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(obj.solution(s));

	}
	// +, -, *, /
	int solution(String s) {
		Stack<Integer> stack = new Stack<>();
		int answer = 0;
		for(Character c : s.toCharArray()) {
			if(c.equals('+')) {
				 int a = stack.pop();
				 int b = stack.pop();
				 int d = Math.abs(a + b);
				 //System.out.println(d);
				 stack.push(a + b);
				 
			}
			else if(c.equals('-')) {
				int a = stack.pop();
				int b = stack.pop();
				int d = Math.abs(a - b);
				 //System.out.println(a - b);
				 stack.push(d);
			}
			else if(c.equals('*')) {
				int a = stack.pop();
				int b = stack.pop();
				int d = Math.abs(a * b);
				 //System.out.println(a * b);
				 stack.push(d);
			}
			else if(c.equals('/')) {
				int a = stack.pop();
				int b = stack.pop();
				int d = Math.abs(a / b);
				// System.out.println(a / b);
				 stack.push(d);
			}
			else {
				int n = Character.getNumericValue(c);
				//System.out.println("n = " + n);
				stack.add(n);
			}
			if(!stack.isEmpty()) {
				answer = stack.get(0);
			}
		}
		return answer;
	}
}
 