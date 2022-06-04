package lesson3b;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> a;
        Set<Integer> bad = new HashSet();
        Set<Integer> good = new HashSet();

        String s = in.nextLine();
        a = Arrays.stream(s.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int el : a) {
            if (!bad.contains(el)) {
                if (good.contains(el)) {
                    good.remove(el);
                    bad.add(el);
                } else {
                    good.add(el);
                }
            }
        }

        for (int el : a) {
            if (good.contains(el)) {
                System.out.print(el + " ");
            }
        }
    }
}