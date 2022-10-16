import java.util.Scanner;

public class Candy_Love {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for(int x:arr) sum+=x;
            if(sum%2!=0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
