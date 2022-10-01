public class CreatingCustomException {
//    public static void main(String[] args) {
//        try
//        {
//            int data=50/0; //may throw exception
//        }
//        // handling the exception
//        catch(Exception e)
//        {
//            // displaying the custom message
//            System.out.println("Can't divided by zero");
//        }
//    }

//    public static void main(String[] args) {
//        try
//        {
//            int arr[]= {1,3,5,7};
//            System.out.println(arr[10]); //may throw exception
//        }
//        // handling the array exception
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("Hello");
//        }
//        System.out.println("rest of the code");
//    }


    public static void main(String args[]){

        try {

            System.out.println("Inside the try block");

            //below code throws divide by zero exception
            int data=25/0;
            System.out.println(data);
        }
        //cannot handle Arithmetic type exception
        //can only accept Null Pointer type exception
        catch(NullPointerException e){
            System.out.println(e);
        }

        //executes regardless of exception occured or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");
    }
}
