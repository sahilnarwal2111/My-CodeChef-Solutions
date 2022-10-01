import java.util.Scanner;

public class Chess_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i< t; i++) {
            int n = sc.nextInt();
            n = n * 60;
            int answer = n / 20;
            System.out.println(answer);
        }
    }
}
