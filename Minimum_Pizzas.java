import java.util.Scanner;

public class Minimum_Pizzas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            double totalSlice = n*x;
            double pizza = totalSlice/4;
            int num = (int) Math.ceil(pizza);
            System.out.println(num);
        }
    }
}
