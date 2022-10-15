import java.util.Scanner;

public class Airline_Restrictions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a,b,c,d,e;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            e = sc.nextInt();
            if((a+b<=d&&c<=e)||(b+c<=d&&a<=e)||(c+a<=d&&b<=e)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
