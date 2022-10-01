import java.util.Scanner;

public class Height_of_Rationals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] xyz = str.split(" ");
        int x = Integer.parseInt(xyz[0]);
        int y = Integer.parseInt(xyz[1]);
        System.out.println(Math.max(x,y));
    }
}
