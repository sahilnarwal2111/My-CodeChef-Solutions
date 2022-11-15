import java.util.Scanner;

public class Make_Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b%a==0){
                System.out.println("YES");
            }
            else {
                if(2*a>=b){
                    System.out.println("NO");
                }
                else System.out.println("YES");
            }
        }

    }
}
