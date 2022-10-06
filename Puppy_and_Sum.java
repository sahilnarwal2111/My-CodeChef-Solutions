import java.util.Scanner;

public class Puppy_and_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int d = sc.nextInt();
            int n = sc.nextInt();
            while(d-->0){
                n = (n*(n+1))/2;
            }
            System.out.println(n);

        }
    }
}
