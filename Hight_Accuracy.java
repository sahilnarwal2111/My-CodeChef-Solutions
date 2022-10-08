import java.util.Scanner;

public class Hight_Accuracy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int marks = sc.nextInt();
            if(marks % 3 == 0) System.out.println(0);
            else {
                int correctQue = marks /3 + 1;
                System.out.println(correctQue*3-marks);
            }
        }
    }
}
