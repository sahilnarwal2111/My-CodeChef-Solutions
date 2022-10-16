import java.util.Scanner;

public class Minimum_Attendance_Requirement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            String [] arrStr = str.split("");
            int min = (75*120)/100;
            int arr[] = new int[n];
            int attendence = 0;
            for(int i = 0; i<n; i++){
                arr[i] = Integer.parseInt(arrStr[i]);
                if(arr[i]==1) attendence++;
            }
            int totalAttendence = attendence + 120-n;
            if(totalAttendence>=min) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
