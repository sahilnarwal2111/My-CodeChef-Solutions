import java.util.Scanner;

public class Easy_Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            for(int i = n; i>0;i--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
