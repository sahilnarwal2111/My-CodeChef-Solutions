import java.util.Scanner;

public class Tyre_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            n = n*2;
            int m = sc.nextInt();
            m = m * 4;
            System.out.println(n+m);
        }
    }
}
