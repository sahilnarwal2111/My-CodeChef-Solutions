import java.util.Scanner;

public class Minimum_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i< t; i++) {
            int x = sc.nextInt();
            System.out.println(x % 10);
        }
    }
}
