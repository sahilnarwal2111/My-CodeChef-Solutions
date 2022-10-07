import java.util.Scanner;

public class Count_Holidays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // 6 7
        // 13 14
        // 20 21
        // 27 28
        while(t-->0){
            int count = 8;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i<n; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0 ; i< n; i++){
                if( arr[i] == 6 ||
                    arr[i] == 7 ||
                    arr[i] == 13 ||
                    arr[i] == 14 ||
                    arr[i] == 20 ||
                        arr[i] == 21 ||
                        arr[i] == 27 ||
                        arr[i] == 28){
                    continue;
                }else count++;
            }
            System.out.println(count);

        }
    }
}
