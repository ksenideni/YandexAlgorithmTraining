package lesson2b;

import java.util.Scanner;

public class PalindromeMaking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) res++;
        }
        System.out.println(res);
    }
}
