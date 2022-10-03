package Binary_Search;
import java.lang.Math;
import java.util.Scanner;

public class Covid_and_Theatre_Tickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] nx = str.split(" ");
            double N = Double.parseDouble(nx[0]);
            double X = Double.parseDouble(nx[1]);
            double n =N/2;
            double x = X/2;
            int row = (int)Math.ceil(n);
            int number = (int)Math.ceil(x);
            System.out.println(row*number);
        }

        /*
        1 - 1
        2 - 1
        3 - 2 - 1.5
        4 - 2
        5 - 3 - 2.5
        6 - 3


         */
    }
}
