import java.util.Scanner;

public class Beer_and_Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<=0 || b<=0){
                System.out.println("NO");
                break;
            }
            int diff = Math.abs(a-b);
            int max = Math.max(a,b);
            max-=2;
            int i = max/2;
            int flag = 0;
            if(2*i+1 == Math.min(a,b)) flag =1;
            if(diff ==2 || flag ==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
