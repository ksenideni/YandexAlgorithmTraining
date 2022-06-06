package lesson3b;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        Set<Integer> a = new HashSet<>();
        Set<Integer> ans = new HashSet();
        for (int i = 1; i <= n; i++) {
            ans.add(i);
        }

        String s = in.nextLine();

        while (!s.equals("HELP")) {
            if (s.equals("YES")) {
                ans.retainAll(a);
            }
            else {
                if (s.equals("NO")) {
                    ans.removeAll(a);
                }
                else {
                    a = Arrays.stream(s.split(" "))
                            .map(Integer::parseInt).collect(Collectors.toSet());
                }
            }
            s = in.nextLine();
        }
        ans.stream().sorted().forEach(x -> System.out.print(x + " "));
    }
}