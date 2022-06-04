package lesson3b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberBefore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> a;
        Set<Integer> b = new HashSet();

        String s = in.nextLine();
        a = Arrays.stream(s.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int el : a) {
            if (b.contains(el)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
                b.add(el);
            }
        }
    }
}
