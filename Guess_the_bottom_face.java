import java.util.Scanner;

public class Guess_the_bottom_face {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(7-n);
        }
    }
}
