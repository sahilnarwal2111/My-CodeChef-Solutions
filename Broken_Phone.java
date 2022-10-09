import java.util.Scanner;

public class Broken_Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x>y) System.out.println("new phone");
            else if(x<y) System.out.println("repair");
            else System.out.println("any");
        }
    }
}
