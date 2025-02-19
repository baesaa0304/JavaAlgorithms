package HashMap_TreeSet.algorithmss04;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String T = br.readLine();
		System.out.println(obj.solution(S, T));

	}
	int solution(String s , String t) {
		int answer = 0;
		int tl = t.length();
		int sl = s.length();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> HM = new HashMap<Character, Integer>();
		ArrayList<Character> list = new ArrayList<Character>();
		for(Character c : s.toCharArray()) {
			list.add(c);
		}
		
		int lt =0;
		for(Character c : t.toCharArray()) {
			HM.put(c,HM.getOrDefault(c, 0) + 1);
		}
		//System.out.println("Initial HM: " + HM); // T에 대한 해시맵 출력

		for (int i = 0; i < tl - 1; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        //System.out.println("Initial map : " + map); 
        
		for(int i = tl - 1; i < sl; i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            if (HM.equals(map)) answer++;
            map.put(s.charAt(lt), map.get(s.charAt(lt)) - 1);
            if (map.get(s.charAt(lt)) == 0) {
                map.remove(s.charAt(lt));
            }
            lt++;
        }
		
		return answer;
	}
}
 