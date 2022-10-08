import java.util.Scanner;

public class Self_Defence_Training {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int arr[] = new int[sc.nextInt()];
            for(int i = 0 ; i< arr.length ; i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for(int x: arr){
                if (x>=10 && x<=60) count++;
            }
            System.out.println(count);

        }
    }
}
