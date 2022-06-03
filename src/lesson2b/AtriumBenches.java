package lesson2b;

import java.util.Scanner;

public class AtriumBenches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int K = in.nextInt();
        int a[] = new int[K];

        for (int i = 0; i < K; i++) {
            a[i] = in.nextInt();
        }
        int middle = L / 2;
        int left = 0, right = 0;
        for (int i = 0; i < K; i++) {
            if (L % 2 == 1 && a[i] == middle) {
                left = right = a[i];
                break;
            }
            if (a[i] < middle) {
                left = a[i];
            }
            else {
                right = a[i];
                break;
            }
        }
        if (left == right) {
            System.out.println(left);
        }
        else {
            System.out.println(left + " " + right);
        }
    }
}
