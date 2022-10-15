import java.util.Scanner;

public class Cutting_Recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n>=2) {
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                int min = arr[0];
                for (int i = 0; i < n; i++) {
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                }
                int flag = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] % min != 0) {
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0) {
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] / min + " ");
                    }
                    System.out.println();
                } else {
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
