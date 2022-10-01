import java.util.Scanner;
public class Non_Negative_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            String[] arrStr = str.split(" ");
            int[] arr = new int[arrStr.length];
            for (int k = 0; k < arrStr.length; k++) {
                arr[k] = Integer.parseInt(arrStr[k]);
            }
            int count = 0;
            for (int j : arr) {
                if (j < 0) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            count = 0;
        }
    }
}
