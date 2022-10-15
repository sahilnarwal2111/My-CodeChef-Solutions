import java.util.Scanner;

public class Chef_and_Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count = 0;
            long [] arr = new long[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextLong();
            }
            for(int i = 0; i<n ; i++){
                long s = 0, p =1;
                for(int j = i;j<n; j++){
                    s = s+ arr[j];
                    p = p * arr[j];
                    if(s==p) count++;

                }
            }
            System.out.println(count);
        }
    }
}
