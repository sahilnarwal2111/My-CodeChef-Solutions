import java.util.Scanner;

public class Break_the_Stick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();
            long x = sc.nextLong();
            long remain = n-x;
            if(remain%2 == x%2){
                System.out.println("YES");
            }
            else if(remain%2 == 0 && x%2!=0) System.out.println("YES");
//            else if(remain<0) System.out.println("NO");
            else System.out.println("NO");
        }
    }
}
