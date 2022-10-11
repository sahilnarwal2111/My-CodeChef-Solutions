import java.util.Scanner;

public class Chef_and_Races {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            // x and y are races in race
            int count =2;
            if(x == a) count--;
            if(x == b) count--;
            if(y == a) count--;
            if(y == b) count--;
            System.out.println(count);
        }
    }
}
