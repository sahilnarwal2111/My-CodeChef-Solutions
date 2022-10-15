import java.util.Scanner;

public class End_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0; i<n;i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            while(arr[0] != 1&& arr[n-1]!=n){
                int i = 0;
                for(i = 0; i<n-1; i++){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                count++;
            }
            System.out.println(count);
        }

    }
}
