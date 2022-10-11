import java.util.Scanner;

public class Building_Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            double t1 = a/x;
            double t2 = b/y;
            if(t1>t2){
                System.out.println("Chefina");
            }
            else if(t1<t2){
                System.out.println("Chef");
            }
            else System.out.println("Both");
        }
    }
}
