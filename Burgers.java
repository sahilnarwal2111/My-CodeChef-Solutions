import java.util.Scanner;

public class Burgers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println((int)Math.min(x,y));
        }
    }
}
