import java.util.Scanner;

public class The_Begining_Of_Cyberverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int answer = (int)Math.floor(k/n);
            System.out.println(answer);
        }
    }
}
