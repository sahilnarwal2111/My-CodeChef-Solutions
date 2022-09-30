import java.util.Scanner;

public class Bidding {
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
            //x for Charlie
            // y for Bob
            //z  for Alice
            if(x>y && x > z ){
                System.out.println("Alice");
            }
            if(y>z && y > x ){
                System.out.println("Bob");
            }
            if(z>x && z > y ){
                System.out.println("Charlie");
            }

        }
    }
}
