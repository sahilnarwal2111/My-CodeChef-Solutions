import java.util.Scanner;

public class Minimum_number_of_coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int num = sc.nextInt();
            if(num%5 != 0) System.out.println(-1);
            else{
                if(num%10==0) System.out.println(num/10);
                else {
                    int ten = num/10;
                    System.out.println(ten+1);
                }
            }
        }
    }
}
