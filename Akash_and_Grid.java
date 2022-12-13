import java.util.Scanner;

public class Akash_and_Grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int diff = Math.abs(x-y);
            if(diff%2 == 0) System.out.println(0);
            else System.out.println(1);
        }
    }
}




