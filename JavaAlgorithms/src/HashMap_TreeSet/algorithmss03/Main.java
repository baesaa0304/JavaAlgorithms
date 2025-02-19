package HashMap_TreeSet.algorithmss03;


import java.io.*;
import java.util.*;

public class Main {
    ArrayList<Integer> solution(int n, int k, int arr[]) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i <= n - k; i++) { // n-k까지 반복 (배열 범위 초과 방지)
            //System.out.println("i = " + i);
            HashSet<Integer> map = new HashSet<>();

            for (int j = i; j < i + k; j++) { // 크기 k만큼 부분 배열을 탐색
                map.add(arr[j]); // 유니크한 요소만 저장
                //System.out.println("arr[" + j + "] = " + arr[j]);
            }

            //System.out.println("-------------------------");
            answer.add(map.size()); // 유니크한 값 개수 저장
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main obj = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i : obj.solution(N, K, arr)) {
            System.out.print(i + " ");
        }
    }
}