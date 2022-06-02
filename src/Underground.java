import java.util.Scanner;

public class Underground {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i = in.nextInt();
        int j = in.nextInt();
        if(i>j){
            int t=j;
            j=i;
            i=t;
        }
        int res = Math.min(N - j - 1 + i, j - i - 1);
        System.out.println(res);
    }
}
