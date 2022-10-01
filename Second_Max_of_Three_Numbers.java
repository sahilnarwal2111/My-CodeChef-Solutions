import java.util.Scanner;

public class Second_Max_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i =0; i< t; i++) {
            String str = sc.nextLine();
            String[] xyz = str.split(" ");
            int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            int z = Integer.parseInt(xyz[2]);
            if((x>y && x < z ) || (x<y && x > z )){
                System.out.println(x);
            }
            if((y>z && y < x ) || (y<z && y > x )){
                System.out.println(y);
            }
            if((z>x && z < y ) || (z<x && z > y )){
                System.out.println(z);
            }

        }
    }
}
