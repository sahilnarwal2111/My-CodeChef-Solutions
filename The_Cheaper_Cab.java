import java.util.Scanner;

public class The_Cheaper_Cab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] xyz = str.split(" ");
            int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            if(x>y){
                System.out.println("SECOND");
            }
            else if(x<y){
                System.out.println("FIRST");
            }
            else{
                System.out.println("ANY");
            }
        }
    }
}
