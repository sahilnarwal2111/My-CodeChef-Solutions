import java.util.Scanner;

public class Test_Averages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int ab = (a+b)/2;
            int bc = (b+c)/2;
            int ca = (c+a)/2;
            if(ab<35 || bc<35 || ca<35){
                System.out.println("fail");
            }
            else System.out.println("pass");
        }
    }
}
