package lesson2b;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int max = i;
        int count = 0;
        while (i > 0) {
            if (i > max) {
                max = i;
                count = 1;
            }
            else {
                if (i == max) {
                    count++;
                }
            }
            i = in.nextInt();
        }
        System.out.println(count);
    }
}
