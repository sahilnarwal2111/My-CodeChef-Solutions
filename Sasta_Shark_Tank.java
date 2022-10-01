import java.util.Scanner;

public class Sasta_Shark_Tank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i< n; i++) {
            String str = sc.nextLine();
            String value[] = new String[2];
            value = str.split(" ");
            int a = Integer.parseInt(value[0]);
            int b = Integer.parseInt(value[1]);
            int A = a * 10;
            int B = b * 5;
            if (A > B) {
                System.out.println("FIRST");
            } else if (A < B) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }

    }
}
