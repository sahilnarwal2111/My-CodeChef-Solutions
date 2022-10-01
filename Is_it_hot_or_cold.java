import java.util.Scanner;

public class Is_it_hot_or_cold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] xyz = str.split(" ");
            int x = Integer.parseInt(xyz[0]);
            if(x>20){
                System.out.println("HOT");
            }
            else{
                System.out.println("COLD");
            }
        }
    }
}
