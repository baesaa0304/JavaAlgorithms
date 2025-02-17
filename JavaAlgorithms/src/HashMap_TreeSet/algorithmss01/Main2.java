package HashMap_TreeSet.algorithmss01;


import java.io.*;
import java.util.*;

public class Main2 {
	
	Character solution(String s , int n) {
		Character answer =' ';
		int maxValue = Integer.MIN_VALUE; 
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for(char t : s.toCharArray()) {
			map.put(t, map.getOrDefault(t, 0) + 1);
		}
		for(char key : map.keySet()) {
			if(maxValue < map.get(key)) {
				maxValue = map.get(key);
				answer = key;
			}
		}
       
        return answer;
	}
	
	
	public static void main(String[] args) throws IOException {
		Main2 obj = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String chairman = br.readLine();
		System.out.println(obj.solution(chairman, N));
	}
}
 