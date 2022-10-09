import java.util.Scanner;

public class Speciality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int max;
            if(x>y){
                max = Math.max(x, z);
            }else{
                max = Math.max(y, z);
            }
            if(max == x){
                System.out.println("setter");
            }
            if(max == y){
                System.out.println("tester");
            }
            if(max == z){
                System.out.println("editorialist");
            }
        }
    }
}
