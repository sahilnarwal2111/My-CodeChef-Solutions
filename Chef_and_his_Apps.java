import java.util.Scanner;

public class Chef_and_his_Apps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int s = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int available = s - ( x + y );
            if(z<=available){
                System.out.println(0);
            }
            else{
                available = available + Math.max(x,y);
                if(z<=available) System.out.println(1);
                else System.out.println(2);
            }
        }
    }
}
