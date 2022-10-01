public class NestedTryCatchBlock01 {
    public static void main(String[] args) {
        try{
            try{
                try{
                    int arr [] = {1,2,3,4};
                    System.out.println(arr[10]);
                }
                catch (ArithmeticException e){
                    System.out.println("Arithmetic exception");
                    System.out.println("Inner try block 2");
                }
            }
            catch (ArithmeticException e){
                System.out.println("Arithmetic exception");
                System.out.println("Inner try block 2");
            }
        }catch (ArrayIndexOutOfBoundsException e4 ){
            System.out.println(e4);
            System.out.println("Outer try block");
        }
        catch (Exception e5){
            System.out.println(e5);
            System.out.println("handled in main try catch block");
        }
    }
}
