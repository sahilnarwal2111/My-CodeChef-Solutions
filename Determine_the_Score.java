import java.util.Scanner;

public class Determine_the_Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            x/=10;
            System.out.println(x*sc.nextInt());
        }
    }
}
