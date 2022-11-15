import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Block_Game {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            if(a.charAt(0)==a.charAt(a.length()-1)) System.out.println("wins");
            else
            {
                System.out.println("loses");
            }
        }
    }
}
