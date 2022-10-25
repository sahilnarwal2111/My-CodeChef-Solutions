import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum = 0;
            while(n>0){
                int d = n%10;
                sum = sum+ d;
                n = n/10;
            }
            System.out.println(sum);
        }
    }
}
