import java.util.Scanner;

public class Expense_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int totalIncome = (int) Math.pow(2,x);
            int saving = 0;
            int totalExpense = 0;
            for(int i = 1; i<=n;i++){
                totalExpense+=(int)Math.pow(2,x-i);
            }
            saving = totalIncome-totalExpense;
            System.out.println(saving);

        }
    }
}
