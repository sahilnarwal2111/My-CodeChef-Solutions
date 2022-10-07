import java.util.Scanner;

public class HOW_MANY_DIGITS_DO_I_HAVE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int digits = 1;
        do{
            n = n /10;
            if(n!=0){
                digits++;
            }
        }while (n!=0);
        System.out.println(digits);
    }
}
