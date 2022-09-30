import java.util.Scanner;

public class fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++){
            int x = sc.nextInt();
            if(x>98){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
