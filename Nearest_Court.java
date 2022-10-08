import java.util.Scanner;

public class Nearest_Court {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int avg = ( x + y ) / 2;
            int a = Math.abs(avg-x);
            int b = Math.abs(avg-y);
            System.out.println(Math.max(a,b));
        }
    }
}
