import java.util.Scanner;

public class Ticket_Fine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] xyz = str.split(" ");
            int x = Integer.parseInt(xyz[0]);
            int p = Integer.parseInt(xyz[1]);
            int q = Integer.parseInt(xyz[2]);
            int diff = p-q;
            diff = diff*x;
            System.out.println(diff);

        }
    }
}
