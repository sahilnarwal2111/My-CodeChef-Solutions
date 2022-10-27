import java.util.Scanner;

public class Workers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] t = new int[n];
        for(int i = 0 ; i< n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i< n; i++){
            t[i] = sc.nextInt();
        }
        int min1 = 100000, min2 = 100000, min3 = 100000;
        for(int i = 0 ; i< n ; i++){
            if(t[i] == 1){
                min1 = Math.min(min1, arr[i]);
            }
            if(t[i] == 2){
                min2 = Math.min(min2, arr[i]);
            }
            if(t[3] == 3){
                min3 = Math.min(min3, arr[i]);
            }
        }
        System.out.println(Math.min(min3, (min1 + min2)));

    }
}
