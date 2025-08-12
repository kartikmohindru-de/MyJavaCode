public class MainExceptionHandlingExample {
    public static void main(String[] args){
        int i =12;
        int j =2;
        try{
            int result = i/(j-2);
            System.out.println(result);

        } catch (ArithmeticException  ex){
            System.out.println("invalid math op "+ex.getMessage());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());

        }/*
        if we do this in this way that is if a generalise exception(Exception)
         is called before more specific exception the gen exception will catch
         the error first as they are assessed top to bottom to mitigate this
         the more gen exception should be moved above the order
        catch (ArithmeticException  ex){
            System.out.println("invalid math op "+ex.getMessage());
        }*/
    }
}
/*All runtime exceptions are runtime exception
all exceptions other than runtime are checked exceptions
any of these if not handled or caught can break the code.
 */