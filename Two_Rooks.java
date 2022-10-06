import java.util.Scanner;

public class Two_Rooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] xyz = str.split(" ");
            int x1 = Integer.parseInt(xyz[0]);
            int y1 = Integer.parseInt(xyz[1]);
            int x2 = Integer.parseInt(xyz[2]);
            int y2 = Integer.parseInt(xyz[3]);
            if(x1==x2 && y1 == y2){
                System.out.println("No");
                break;
            }
            if(x1 == x2 || x1 == y2 || y1 == x2 || y1 == y2){
                System.out.println("Yes");
            }else System.out.println("No");
        }
    }
}
