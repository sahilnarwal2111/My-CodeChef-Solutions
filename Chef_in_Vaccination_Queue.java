import java.util.Scanner;

public class Chef_in_Vaccination_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int p = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i< n; i++) arr[i] = sc.nextInt();
            int time = 0;
            for(int i = p-2;i>=0;i--){
                if(arr[i]==0){
                    time  = time + x;
                }
                else time = time + y;
            }
            System.out.println(time + y);
        }
    }
}
