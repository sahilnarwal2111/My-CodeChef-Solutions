import java.util.Scanner;

public class Can_you_eat_it {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(n%k == 0){
                System.out.println(n/k);
            }
            else if(n == 0){
                System.out.println(0);
            }
            else System.out.println("-1");
        }
    }
}
