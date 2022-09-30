import java.util.Scanner;

public class Car_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int x = sc.nextInt();
            if(x<300){
                System.out.println("3000");
            }
            else{
                System.out.println(x+"0");
            }
        }
    }
}
