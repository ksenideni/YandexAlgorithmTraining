package lesson4b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Voting {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        File file = new File("input.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String d;
            while ((d = br.readLine()) != null) {
                int a = Integer.parseInt(d.split(" ")[1]);
                d = d.split(" ")[0];
                if (!map.containsKey(d)) {
                    map.put(d, 0);
                }
                map.put(d, map.get(d) + a);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        map.keySet().stream().sorted().forEach(x -> System.out.println(x + " " + map.get(x)));
    }
}