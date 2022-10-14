import java.util.Scanner;

public class Card_Removal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            //array assign for zero
            int[] numberRepeat = new int[n];
            for(int i = 0; i<n;i++){
                numberRepeat[i]=0;
            }
            //corresponding with number of occurences
            for(int i=0;i<n;i++){
                int element = arr[i];
                for(int j = 0;j<n;j++){
                    if(element == arr[j]){
                        numberRepeat[i]++;
                    }
                }
            }
            //finding the max number of occurrences
            int maxRepeat = numberRepeat[0];
            for(int i = 0; i<n; i++){
                if(maxRepeat<numberRepeat[i]){
                    maxRepeat = numberRepeat[i];
                }
            }
            System.out.println(n- maxRepeat);
        }
    }
}
