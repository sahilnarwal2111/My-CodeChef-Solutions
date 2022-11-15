import java.util.Scanner;

public class Tasty_Decisions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = 2*sc.nextInt();
            int y = 5*sc.nextInt();
            if(x>y) System.out.println("Chocolate");
            else if(x==y) System.out.println("Either");
            else System.out.println("Candy");
        }
    }
}
