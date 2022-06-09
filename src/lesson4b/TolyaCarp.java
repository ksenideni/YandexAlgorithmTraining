package lesson4b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TolyaCarp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Long, Long> map = new HashMap();

        for (int i = 0; i < n; i++) {
            Long d = in.nextLong();
            Long a = in.nextLong();
            if (!map.containsKey(d)) {
                map.put(d, 0L);
            }
            map.put(d, map.get(d) + a);
        }
        map.keySet().stream().sorted().forEach(x -> System.out.println(x + " " + map.get(x)));
    }
}
