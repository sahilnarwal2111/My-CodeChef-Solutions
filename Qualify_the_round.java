import java.util.Scanner;

public class Qualify_the_round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] xyz = str.split(" ");
            int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            int z = Integer.parseInt(xyz[2]);
            int total = y + z*2;
            if(total>=x){
                System.out.println("Qualify");
            }
            else System.out.println("NotQualify");


        }
    }
}
