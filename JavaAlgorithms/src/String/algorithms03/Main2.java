package String.algorithms03;

import java.io.*;

public class Main2 {

    String solution(String s) {
        String answer = "";
        int maxString = Integer.MIN_VALUE;
        int pos;

        while ((pos = s.indexOf(" ")) != -1) { // 공백을 찾는 동안 반복
            String tmp = s.substring(0, pos); // 공백 앞 부분의 단어 추출
            int len = tmp.length();
            if (len > maxString) { // 최대 길이 갱신
                maxString = len;
                answer = tmp;
            }
            s = s.substring(pos + 1); // 공백 이후 문자열 갱신
        }

        // 마지막 단어 처리
        if (s.length() > maxString) {
            answer = s;
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