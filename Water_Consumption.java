import java.util.Scanner;

public class Water_Consumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            if(sc.nextInt()>=2000) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
