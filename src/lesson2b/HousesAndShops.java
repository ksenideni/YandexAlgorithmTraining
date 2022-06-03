package lesson2b;

import java.util.Scanner;

public class HousesAndShops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d[] = new int[10];
        int a[] = new int[10];
        int prev = -1;
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
            if (a[i] == 1) {
                if (prev != -1) d[i] = i - prev;
            }
            else {
                if (a[i] == 2) {
                    for (int j = i - 1; j > prev; j--) {
                        if (a[j] == 1 && d[j] == 0) {
                            d[j] = i - j;
                        }
                        else {
                            d[j] = Math.min(d[j], i - j);
                        }
                    }
                    prev = i;
                }
            }
        }
        int max = -1;
        for (int i = 0; i < 10; i++) {
            if (d[i] > max) {
                max = d[i];
            }
        }
        System.out.println(max);
    }
}
