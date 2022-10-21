import java.util.Scanner;

public class Chef_Diet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] arr = new int[n];
            int flag =0;
            for(int i =0; i<n;  i++) arr[i] = sc.nextInt();
            int sum = 0;
            for(int i = 0; i<n; i++){
                sum = sum + arr[i];
                if(sum >= k) sum = sum -k;
                else {
                    System.out.println("NO " + (i + 1));
                    flag =1;
                    break;
                }
            }
            if(flag==0) System.out.println("YES");
        }
    }
}
