import java.util.Arrays;
import java.util.Scanner;

public class TCS_Examination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < t ; i++){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            String numArr1[] = str1.split(" ");
            String numArr2[] = str2.split(" ");
            int num1[] = new int[3];
            int num2[] = new int[3];
            int total1 = 0;
            int total2 = 0;
            for(int j = 0; j<3 ; j++){
                num1[j] = Integer.parseInt(numArr1[j]);
                num2[j] = Integer.parseInt(numArr2[j]);
            }
            for(int j = 0; j< 3; j++){
                total1 = total1 + num1[j];
                total2 = total2 + num2[j];
            }
            if(Arrays.equals(num1,num2)){
                System.out.println("TIE");
                continue;
            }
            if(total1>total2){
                System.out.println("DRAGON");
            }
            else if(total1 == total2){
                if(num1[0]>num2[0]){
                    System.out.println("DRAGON");
                }
                else if(num1[0] == num2[0]){
                    if(num1[1]>num2[1]){
                        System.out.println("DRAGON");
                    }
                    else if(num1[1] == num2[1]){
                        if(num1[2]>num2[2]){
                            System.out.println("DRAGON");
                        }else System.out.println("SLOTH");
                    }
                    else System.out.println("SLOTH");
                }
                else System.out.println("SLOTH");
            }
//            else System.out.println("SLOTH");

        }
    }
}
