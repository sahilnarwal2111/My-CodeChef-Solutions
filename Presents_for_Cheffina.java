import java.util.Scanner;

public class Presents_for_Cheffina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int r,q;
            q=n/5;
            r=n%5;
            System.out.println((q*4 + r));
        }
    }
}
