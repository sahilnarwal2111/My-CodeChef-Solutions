import java.util.Scanner;

public class Buying_New_Tablet {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int tc = sn.nextInt();
        while(tc-->0){
            int n = sn.nextInt();
            int b = sn.nextInt();
            int [][] arr = new int[n][2];
            for(int i = 0; i< n; i++){
                //width*height
                arr[i][0] = sn.nextInt() * sn.nextInt();
                //
                //price
                arr[i][1] = sn.nextInt();
            }
            int max_area = 0;
            for(int i = 0 ; i< n; i++){
                if(arr[i][1]<=b){
                    if(arr[i][0]>max_area){
                        max_area = arr[i][0];
                    }
                }
            }
            if(max_area == 0){
                System.out.println("no tablet");
            }
            else System.out.println(max_area);

        }
    }
}
