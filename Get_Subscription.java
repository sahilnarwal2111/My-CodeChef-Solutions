import java.util.Scanner;

public class Get_Subscription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] xyz = str.split(" ");
            int x = Integer.parseInt(xyz[0]);
            if(x<=30){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
