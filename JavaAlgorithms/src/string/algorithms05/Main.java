package string.algorithms05;

import java.io.*;
import java.util.ArrayList;

public class Main {
    // 문자열 뒤집는 메서드
    String solution(String s) {
    	String answer;
        char[] charArr = s.toCharArray();  // 문자열을 char 배열로 변환
        
        int a = 0;  // 첫 번째 인덱스
        int b = s.length() - 1;  // 마지막 인덱스
        
        // 두 인덱스가 교차할 때까지 swap을 반복
        while(a < b) {
        	if(!Character.isAlphabetic(charArr[a])) {
        		a++;	
			}
        	else if(!Character.isAlphabetic(charArr[b])) {
        		b--;
        	}
        	else {
        		char temp = charArr[a];
                charArr[a] = charArr[b];
                charArr[b] = temp;
                
                // 인덱스 이동
                a++;
                b--;
        	}
            
        }
        
        // 새로운 문자열로 변환해서 반환
        //return new String(charArr);
        answer = String.valueOf(charArr);
        return answer;
    }

	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String word = br.readLine(); 
		System.out.println(obj.solution(word)); 

		br.close();
	}
}
 