import java.util.Scanner;

public class All_possible_Sub_Arrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for(int i =0; i<5 ; i++){
            for(int j = i; j<5;j++){
                for(int k = i; k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
}
