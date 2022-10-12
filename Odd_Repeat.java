import java.util.Scanner;

public class Odd_Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int s = sc.nextInt();
            int sum = n*n;

            int remain = s - sum;
            int [] arr = new int[n];
            for(int i = 1;i<=n;i++){
                arr[i-1] = (2*i)-1;
            }
            for(int i = 0; i<n;i++){
                if(arr[i]*(k-1) == remain){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
