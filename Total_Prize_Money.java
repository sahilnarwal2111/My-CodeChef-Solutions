import java.util.Scanner;

public class Total_Prize_Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++){
            String str = sc.nextLine();
            String[] xy = str.split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            int total = x*10 + y*90;
            System.out.println(total);
        }
    }
}
