import java.util.Scanner;

public class Election_in_Chefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int xa,xb,xc;
            xa = sc.nextInt();
            xb = sc.nextInt();
            xc = sc.nextInt();
            if(xa>50) System.out.println("A");
            else if(xb>50) System.out.println("B");
            else if(xc>50) System.out.println("C");
            else System.out.println("NOTA");
        }
    }
}
