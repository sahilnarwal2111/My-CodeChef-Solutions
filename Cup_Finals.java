import java.util.Scanner;

public class Cup_Finals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int d = sc.nextInt();
            if((x-y)<=d) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
