public class exceptionHandling2 {
    //Generating exception in catch block
    public static void main(String[] args) {
        try{
            int d = 9/0;
        }
        catch (ArithmeticException e){
            //Here We will generate exception
            int t = 9/0;
        }
        System.out.println("I m done with my task");
    }
}
