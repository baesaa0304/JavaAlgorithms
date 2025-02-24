package HashMap_TreeSet.algorithmss05;


import java.io.*;
import java.util.*;

public class Main {
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

		System.out.println(obj.solution(N, K, arr));
	}
	int solution(int n , int k , int arr[]) {
		int answer = -1;
		TreeSet<Integer> tr = new TreeSet<>(Collections.reverseOrder());
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int l = j + 1;l < n; l++) {
					tr.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		int cnt = 0;
		for(int i : tr) {
			cnt++;
			if(cnt == k) return i;
		}
		
		return answer;
	}
}
 