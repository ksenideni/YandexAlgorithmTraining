package lesson3b;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Matching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        Set<Integer> a;
        Set<Integer> b;
        int n = 0;

        s = in.nextLine();
        a = Arrays.stream(s.split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
        s = in.nextLine();
        b = Arrays.stream(s.split(" ")).map(Integer::parseInt).collect(Collectors.toSet());

        for (int el : a) {
            if (b.contains(el)) {
                n++;
            }
        }
        System.out.println(n);
    }
}
