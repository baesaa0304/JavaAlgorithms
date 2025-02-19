package HashMap_TreeSet.algorithmss03;


import java.io.*;
import java.util.*;

public class Main2 {
	ArrayList<Integer> solution(int n, int k, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();
		for(int i=0; i<k-1; i++){
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}
		int lt=0;
		for(int rt=k-1; rt<n; rt++){
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt])-1);
            		if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            		lt++;
		}
		return answer;
	}

    	
    	

    public static void main(String[] args) throws IOException {
        Main2 obj = new Main2();
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