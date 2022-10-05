import java.util.Scanner;

public class Ranklist_Pages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            int answer = 0;
            if (num % 25 == 0) {
                answer = (num / 25);
            } else {
                answer = (num / 25) + 1;
            }
            System.out.println(answer);

        }
    }
}
