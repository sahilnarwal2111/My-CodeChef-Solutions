import java.util.Scanner;

public class Small_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int factorial = 1;
            for(int i = 1;i<=n;i++){
                factorial*=i;
            }
            System.out.println(factorial);
        }
    }
}
