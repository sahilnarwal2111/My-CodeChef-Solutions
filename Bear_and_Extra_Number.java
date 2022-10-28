import java.util.Scanner;

public class Bear_and_Extra_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0 ; i< n; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0 ; i< n; i++){
                 int nxt = arr[i] + 1;
                 int prv = arr[i] - 1;
                 int F = 0;
                 for(int j = 0 ; j < n ; j++){
                     if (arr[j] == nxt || arr[j] == prv) {
                         F = 1;
                         break;
                     }
                 }
                 if(F==0){
                     System.out.println(arr[i]);
                     break;
                 }
                 int cF = 0;
                 for(int k = i+1; k<n ; k++){
                     if(arr[i] == arr[k]){
                         System.out.println(arr[i]);
                         cF =1;
                         break;
                     }
                 }
                 if(cF ==1) break;
            }
        }
    }
}
