import java.util.Scanner;

public class Shopping_Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x%100 == 0){
                System.out.println(0);
            }
            else {
                System.out.println(100-(x%100));
            }
        }
    }
}
