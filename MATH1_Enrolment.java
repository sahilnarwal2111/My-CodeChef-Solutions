import java.util.Scanner;

public class MATH1_Enrolment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] xyz = str.split(" ");
            int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            int diff = x-y;
            diff = Math.abs(diff);
            if(x == y || x>y){
                System.out.println(0);
            }
            else{
                System.out.println(diff);
            }
        }
    }
}
