import java.util.Scanner;

public class Who_is_taller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b) System.out.println("A");
            else System.out.println("B");
        }
    }
}
