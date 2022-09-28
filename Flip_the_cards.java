import java.util.Scanner;

public class Flip_the_cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i< t; i ++) {
            String str = sc.nextLine(); //Number of cards and facing up cards
            String[] value = new String[2];
            value = str.split(" ");
            int N = Integer.parseInt(value[0]);
            int X = Integer.parseInt(value[1]);
            if (X == 0 || X == N) {
                System.out.println(0);
            } else if (X > N / 2) {
                System.out.println(N-X);
            } else {
                System.out.println(X);
            }
        }
    }
}
