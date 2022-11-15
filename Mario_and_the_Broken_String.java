import java.util.Scanner;

public class Mario_and_the_Broken_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String str = sc.next();
            StringBuilder s1 = new StringBuilder(str.substring(0, n / 2));
            StringBuilder s2 = new StringBuilder(str.substring(n / 2, n));

            String sb1 = String.valueOf(s1);
            String sb2 = String.valueOf(s2);
            if((sb1+sb2).equals(str) && (sb2 + sb1).equals(str)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
