import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr = new int[4];
            int flag1 = 0;
            int flag2 = 0;
            for (int i = 0; i < 4; i++) {
                arr[i] = sc.nextInt();
            }
            if ((arr[0] == arr[1] && arr[2] == arr[3])
                    || (arr[0] == arr[2] && arr[1] == arr[3])
                    || (arr[0] == arr[3] && arr[1] == arr[2])) {
                System.out.println("YES");
            } else System.out.println("NO");

        }
    }
}
