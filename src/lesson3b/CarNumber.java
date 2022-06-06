package lesson3b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CarNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = Integer.parseInt(in.nextLine());
        List<Set<Character>> witnesses = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String s = in.nextLine();
            witnesses.add(new HashSet<>());
            Set<Character> set = witnesses.get(i);
            for (char c : s.toCharArray()) {
                set.add(c);
            }
        }
        int n = Integer.parseInt(in.nextLine());
        List<Set<Character>> characterOfCarNumbers = new ArrayList<>();
        List<String> carNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            carNumbers.add(s);
            characterOfCarNumbers.add(new HashSet<>());
            Set<Character> set = characterOfCarNumbers.get(i);
            for (char c : s.toCharArray()) {
                set.add(c);
            }
        }
        int[] res = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (characterOfCarNumbers.get(j).containsAll(witnesses.get(i))) {
                    res[j]++;
                }
            }
        }
        int max = -1;
        for (int i = 0; i < n; i++) {
            if (res[i] > max) {
                max = res[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (res[i] == max) {
                System.out.println(carNumbers.get(i));
            }
        }
    }
}


//
//public class CarNumber {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int m = Integer.parseInt(in.nextLine());
//        List<String> witnesses = new ArrayList<>();
//        for (int i = 0; i < m; i++) {
//            witnesses.add(in.nextLine());
//        }
//        int n = Integer.parseInt(in.nextLine());
//        List<String> carNumbers = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            carNumbers.add(in.nextLine());
//        }
//        int res[] = new int[n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                int count = 0;
//                for (char c : witnesses.get(i).toCharArray()) {
//                    if (carNumbers.get(j).contains(String.valueOf(c))) {
//                        count++;
//                    }
//                }
//                if (count == witnesses.get(i).length()) {
//                    res[j]++;
//                }
//            }
//        }
//        int max = -1;
//        for (int i = 0; i < n; i++) {
//            if (res[i] > max) {
//                max = res[i];
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (res[i] == max) {
//                System.out.println(carNumbers.get(i));
//            }
//        }
//    }
//}