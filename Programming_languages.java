import java.util.Arrays;
import java.util.Scanner;

public class Programming_languages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[6];
        for(int i = 0 ; i < t ; i++) {
            for (int j = 0; j < 6; j++) {
                arr[j] = sc.nextInt();
            }
            if ((arr[2] == arr[0] && arr[3] == arr[1]) || (arr[2] == arr[1] && arr[3] == arr[0])) {
                System.out.println("1");
            } else if ((arr[4] == arr[0] && arr[5] == arr[1]) || (arr[4] == arr[1] && arr[5] == arr[0])) {
                System.out.println("2");
            } else System.out.println("0");
        }
    }
}
