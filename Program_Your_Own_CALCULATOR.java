import java.util.Scanner;

public class Program_Your_Own_CALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char c = sc.next().charAt(0);
        if(b!=0 && c=='+' || c=='-' || c == '/' || c == '*'){
            switch (c) {
                case ('+') -> System.out.println( a + b);
                case ('-') -> System.out.println( a - b);
                case ('/') -> System.out.println( a / b);
                case ('*') -> System.out.println( a * b);
            }
        }
    }
}
