import java.util.Scanner;

public class Reach_The_Target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i< t; i++) {
            String str = sc.nextLine();
            String[] org = str.split(" ");
            int X = Integer.parseInt(org[0]);
            int Y = Integer.parseInt(org[1]);
            System.out.println(X - Y);
        }

    }
}
