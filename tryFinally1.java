public class tryFinally1 {
    public static void main(String[] args) {
        try{
            int t = 9/0;
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("Rest of code goes from here!");
    }
}

//Here first exception is handled by JVM and then at last finally block is executed then only program terminates