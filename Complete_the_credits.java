import java.util.Scanner;

public class Complete_the_credits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            if(m>65) System.out.println("Overload");
            else if(m<35) System.out.println("Underload");
            else System.out.println("Normal");
        }
    }
}
