import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Digit_Sum_Parities {
    static Scanner sc = new Scanner(System.in);
    public int num = sc.nextInt();
    public int digitSum(int num){

        String str = String.valueOf(num);
        int len = str.length();
        int numArr [] = new int[len];
        for(int i = 0 ; i<len; i++){
            int tenNum = 10;
            numArr[i] = num%tenNum;
            tenNum  = tenNum * 10;
            num = num / 10;
        }
        int sum = 0;
        for(int a: numArr){
            sum = sum + a;
        }
        return sum;
    }
    public int parities() {
        int sum = digitSum(num);
        int flag;
        if (sum % 2 == 0) {
            flag = 0;
        } else flag = 1;
        int newFlag;
        do {
            num++;
            int sumNew = digitSum(num);
            if (sumNew % 2 == 0) {
                newFlag = 0;
            } else newFlag = 1;
        } while (flag == newFlag);
        return num;

    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int i = 0; i< t ; i++){
            Digit_Sum_Parities d = new Digit_Sum_Parities();
            System.out.println(d.parities());
        }

    }
}
