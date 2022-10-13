import java.util.Scanner;

public class Lazy_Chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            int timeTaken = x*m;
            int upperLimit = x+d;
            int min = Math.min(timeTaken,upperLimit);
            System.out.println(min);
        }
    }
}
