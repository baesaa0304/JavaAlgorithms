package HashMap_TreeSet.algorithmss02;

import java.io.*;
import java.util.*;
public class Main2 {
	
	String solution(String s , String t) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for(Character c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for(Character c : t.toCharArray()) {
			if(!map.containsKey(c) || map.get(c) == 0) {
				answer = "NO";
				return answer;
			}
			map.put(c, map.get(c) - 1);
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		Main2 obj = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Anagram = br.readLine();
		String Anagram2 = br.readLine();
		System.out.println(obj.solution(Anagram,Anagram2));
	}
}
 