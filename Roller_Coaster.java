import java.util.Scanner;

public class Roller_Coaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i< t; i++){
            String str = sc.nextLine();
            String[] xy = str.split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            if(x>y){
                System.out.println("YES");
            }
            else if (x==y) {
                System.out.println("YES");

            } else
                System.out.println("NO");
        }
    }
}
