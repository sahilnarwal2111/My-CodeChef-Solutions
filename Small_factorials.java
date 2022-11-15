import java.util.Scanner;

public class Small_factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            long answer = 1;
            for(int i = 1 ; i<= n; i++){
                answer*=i;
            }
            System.out.println(answer);
        }
    }
}
