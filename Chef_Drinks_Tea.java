import java.util.Scanner;
import java.lang.Math;

public class Chef_Drinks_Tea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] xyz = str.split(" ");
            double x = Double.parseDouble(xyz[0]);
            double y = Double.parseDouble(xyz[1]);
            int z = Integer.parseInt(xyz[2]);
            double quantity = Math.ceil(x/y);
            int cost = (int) (quantity*z);
            if(cost == 0){
                System.out.println(z);
            }
            else System.out.println(cost);

        }
    }
}
