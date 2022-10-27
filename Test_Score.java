import java.util.Scanner;

public class Test_Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y%x==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
