public class anonmyousArray {
    //creating a method that receievs
    static void printArray(int arr[]){
        for(int x: arr){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        printArray(new int[]{12,12,12,12,12});
    }
}
