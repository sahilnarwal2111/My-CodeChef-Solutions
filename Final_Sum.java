import java.util.Scanner;

public class Final_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0 ; i<n ;i++){
                arr[i] = sc.nextInt();;
            }
            int sum = 0;
            for(int i = 0 ; i< q; i++){
                int l = sc.nextInt();
                int r = sc.nextInt();
                if(r-l == 0 || (r-l)%2 ==0) {
                    sum = sum + 1;
                }
            }
            for(int x:arr) sum = sum + x;
            System.out.println(sum);

        }

    }
}
