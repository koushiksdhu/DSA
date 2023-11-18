// Throwable class contains all the exceptions
/*
                Object
                  |
               Throwable
                  |
         ------------------------
        |                       |
    Exceptions                Errors
    -> Checked              
    -> Unchecked

-> Checked Exceptions are the one which checks during the compile-time.
-> Unchecked Exceptions are the one which checks during the run-time, the compiler cannot able to detect this types of exceptions. (Like, divide by zero exceptions)


-> Catch block can be multiple, but, try and finally block should be one only.

 */

public class Main {
    public static void main(String args[]) {
        int a = 5;
        int b = 0;
        try {
            // divide(a, b);
            String name = "Koushik";
            if(name.equals("Koushik")) {
                throw new MyException("This is an user-defined exception.");
            }
        }
        catch(ArithmeticException e) {      // More strict exceptions should be there first or else less specific/strict exception will get triggered.
            System.out.println(e.getMessage());
            // System.exit(0);
        }
        catch(MyException e) {
            System.out.println("Normal Exception");
            // System.exit(0);
        }
        finally {       // It means basically, no matter what happens this block will always get executed unless there is System.exit(0) in try or catch block.
            System.out.println("This is a finally block.");     // Sometimes, when we have to close the file, then we write that code over here.
            // Irrespective of the exception thrown or not it will always run.
        }

    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0)
            throw new ArithmeticException("Please do not divide by zero.");     // throws this message to the catch() parameter.
        return a / b;
    }
}
