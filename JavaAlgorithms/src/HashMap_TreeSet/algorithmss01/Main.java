package HashMap_TreeSet.algorithmss01;


import java.io.*;
import java.util.*;

public class Main {
	
	String solution(String s , int n) {
		String answer = "";
		int maxValue = Integer.MIN_VALUE; 
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('A',0);
		map.put('B',0);
		map.put('C',0);
		map.put('D',0);
		map.put('E',0);
		
		for(char t : s.toCharArray()) {
			if(map.containsKey(t)) {
				 map.put(t, map.get(t) + 1); 
			}
		}
		char mostFrequent = ' ';
        for (char key : map.keySet()) {
            int freq = map.get(key);
            if (freq > maxValue) {
                maxValue = freq;
                mostFrequent = key;
            }
        }
        
        answer = Character.toString(mostFrequent); // 가장 빈도가 높은 문자를 문자열로 변환하여 반환
        return answer;
	}
	
	
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String chairman = br.readLine();
		System.out.println(obj.solution(chairman, N));
	}
}
 