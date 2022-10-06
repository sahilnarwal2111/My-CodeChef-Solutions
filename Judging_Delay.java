import java.util.Scanner;

public class Judging_Delay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int count = 0;
            int n = sc.nextInt();
            while(n-->0){
                int s = sc.nextInt();
                int j = sc.nextInt();
                int diff = j - s;
                if(diff > 5){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
