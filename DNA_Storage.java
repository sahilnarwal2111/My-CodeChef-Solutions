import java.util.Scanner;

public class DNA_Storage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String str = sc.next();
            String[] new1 = str.split("");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(new1[i]);
            }
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < n; i = i + 2) {
                int d1 = arr[i];
                int d2 = arr[i + 1];
                int num = d1 * 10 + d2;
                switch (num) {
                    case (0) -> ans.append('A');
                    case (1) -> ans.append('T');
                    case (10) -> ans.append('C');
                    case (11) -> ans.append('G');
                }
            }
            System.out.println(ans);
        }

    }
}
