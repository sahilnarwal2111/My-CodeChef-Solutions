import java.util.Scanner;

public class Janmash_and_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            System.out.println(sc.nextInt()*10 + sc.nextInt()*5);
        }
    }
}
