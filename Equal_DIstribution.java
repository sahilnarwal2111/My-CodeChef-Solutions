import java.util.Scanner;

public class Equal_DIstribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] xyz = str.split(" ");
            int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            if((x+y)% 2 == 0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
