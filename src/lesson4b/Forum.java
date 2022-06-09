package lesson4b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Forum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Map<String, Integer> map = new HashMap();
        int[] topics = new int[n];
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(in.nextLine());
            if (k == 0) {
                topics[i] = i;
                String topicName = in.nextLine();
                map.put(topicName, i);
            } else {
                k--;
                topics[i] = topics[k];
            }
            String message = in.nextLine();
        }
        for (int i = 0; i < n; i++) {
            if (topics[i] == i) {
                topics[i] = 1;
            } else {
                int ind = topics[i];
                topics[ind]++;
                topics[i] = -1;
            }
        }
        int max = -1;
        int max_ind = 0;
        for (int i = 0; i < n; i++) {
            if (topics[i] > max) {
                max = topics[i];
                max_ind = i;
            }
        }
        for (String key : map.keySet()) {
            if (map.get(key) == max_ind) {
                System.out.println(key);
                break;
            }
        }
    }
}
