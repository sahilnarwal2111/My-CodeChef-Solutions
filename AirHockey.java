import java.util.Scanner;

public class AirHockey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] xyz = str.split(" ");
            int n = Integer.parseInt(xyz[0]);
            int x = Integer.parseInt(xyz[1]);
            int max = Math.max(n,x);
            int answer = 7 - max;
            System.out.println(answer);
        }
    }
}
