import java.util.Scanner;

public class Pintu_and_Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [] f = new int[n];
            for( int i = 0 ; i< n; i++){
                f[i] = sc.nextInt();
            }
            int [] p = new int[n];
            for( int i = 0 ; i< n; i++){
                p[i] = sc.nextInt();
            }
            int [] cost = new int[m];
            for(int i = 0 ; i< m ; i++) cost[i] = 0;
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j<m ; j++) {
                    if (f[i] == j+1) {
                        cost[j] += p[i];
                    }
                }
            }

            int min = 50;
            for( int i = 0 ; i < m ; i++){
                if(min>cost[i]&&cost[i]!=0) min = cost[i];
            }
            System.out.println(min);
        }
    }
}
