import java.util.Scanner;

public class Chef_and_Bird_farm {
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
            if(z%x==0 && z%y==0){
                System.out.println("ANY");
                continue;
            }
            if(z%x == 0){
                System.out.println("CHICKEN");
                continue;
            }
            if(z%y == 0){
                System.out.println("DUCK");
                continue;
            }
            if(z%x!=0 && z%y!=0){
                System.out.println("NONE");
//                continue;
            }


        }
    }
}
