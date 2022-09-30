import java.util.Scanner;

public class Interior_Design {
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
            int c1 = x1 + y1;
            int c2 = x2 + y2;
            if(c1>c2){
                System.out.println(c2);
            }
            else{
                System.out.println(c1);
            }
        }
    }
}
