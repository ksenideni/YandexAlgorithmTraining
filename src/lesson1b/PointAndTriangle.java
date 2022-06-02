package lesson1b;

import java.util.Scanner;

public class PointAndTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        if (y <= -x + d && x >= 0 && y >= 0) {
            System.out.println(0);
        } else {
            double A = Math.sqrt(x * x + y * y);
            double B = Math.sqrt((x - d) * (x - d) + y * y);
            double C = Math.sqrt(x * x + (y - d) * (y - d));
            if (A <= B) {
                if (A <= C) {
                    System.out.println(1);
                }
                else {
                    System.out.println(3);
                }
            }
            else {
                if (B <= C) {
                    System.out.println(2);
                }
                else {
                    System.out.println(3);
                }
            }
        }
    }
}
