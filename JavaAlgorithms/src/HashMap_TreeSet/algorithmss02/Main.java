package HashMap_TreeSet.algorithmss02;

import java.io.*;
import java.util.*;

public class Main {
	String solution(String s , String t) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for(Character c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for(Character c : t.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) - 1); 
			}
			else {
				answer = "NO";
				return answer;
			}
		}
		Collection<Integer> values = map.values();
		for(int v : values) {
			if(v != 0) {
				answer = "NO";
				return answer;
			}
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Anagram = br.readLine();
		String Anagram2 = br.readLine();
		System.out.println(obj.solution(Anagram,Anagram2));
	}
}
 