import java.util.Scanner;

public class TV_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            a = a - c;
            b = b - d;
            if(a>b) System.out.println("Second");
            else if(a<b) System.out.println("First");
            else System.out.println("Any");
        }
    }
}
