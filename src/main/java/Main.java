import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int sum = n*k;
        if (sum%m == 0){
            System.out.println(sum/m);
        } else System.out.println(sum/m+1);
    }
}
