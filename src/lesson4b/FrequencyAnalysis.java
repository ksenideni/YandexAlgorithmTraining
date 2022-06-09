package lesson4b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyAnalysis {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        File file = new File("input.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String d;
            while ((d = br.readLine()) != null) {
                for (String w : d.split(" ")) {
                    if (!map.containsKey(w)) {
                        map.put(w, 0);
                    }
                    map.put(w, map.get(w) + 1);
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Map<Integer, List<String>> countStringMap = new HashMap<>();
        for (String key : map.keySet()) {
            int count = map.get(key);
            if (!countStringMap.containsKey(count)) {
                countStringMap.put(count, new ArrayList<>());
            }
            List<String> l = countStringMap.get(count);
            l.add(key);
            countStringMap.put(count, l);
        }
        countStringMap.keySet().stream().sorted((o1, o2) -> -Integer.compare(o1, o2)).forEach(x -> {
            countStringMap.get(x).stream().sorted().forEach(System.out::println);
        });
    }
}