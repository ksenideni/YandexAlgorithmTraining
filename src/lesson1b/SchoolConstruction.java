package lesson1b;

import java.util.Scanner;

public class SchoolConstruction {

    //    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        long d = 0;
//        long[] arr = new long[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = in.nextLong();
//            d += arr[i] - arr[0];
//        }
//        int pointer=0;
//        long res=arr[0];
//        for (long i = arr[0]+1; i <= arr[N - 1]; i++) {
//            d+=pointer+1-(N-pointer-1);
//            if(pointer+1-(N-pointer-1)<0){
//                res=i;
//            }
//            if(i==arr[pointer+1]){
//                pointer++;
//            }
//        }
//        System.out.println(res);
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextLong();
        }
        int ind = N / 2;
        System.out.println(arr[ind]);
    }
}

