package lesson2b;

import java.util.Scanner;

public class DiplomasInFolders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = in.nextInt();
        int sum = max;
        for (int i = 0; i < n - 1; i++) {
            int a = in.nextInt();
            sum += a;
            if (a > max) {
                max = a;
            }
        }
        System.out.println(sum - max);
    }
}
