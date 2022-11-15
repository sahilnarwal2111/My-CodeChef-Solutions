import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Water_Mixing {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(b>=a){
                if(b-a<=x) System.out.println("YES");
                else System.out.println("NO");
            }
            else {
                if(a-b<=y) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
