import java.util.Scanner;

public class Audible_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int num = sc.nextInt();
            if(num>=67 && num<=45000){
                System.out.println("Yes");
            }
            else System.out.println("No");
        }
    }
}
