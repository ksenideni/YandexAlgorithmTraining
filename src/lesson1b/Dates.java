package lesson1b;

import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if (x > 12 || y > 12) {
            System.out.println(1);
        }
        else {
            if (x == y) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }
}
