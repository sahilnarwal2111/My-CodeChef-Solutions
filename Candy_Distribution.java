import java.util.Scanner;

public class Candy_Distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n%m==0 && (n/m)%2 == 0 ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
