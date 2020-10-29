public class Exceptions {
    public static void main(String[] args) {
        int num1, num2;
        num1=10;
        num2=0;

        try
        {
            int result = num1/num2;
            System.out.println("The result is :" + result);
        }
        catch(Exception e)
        {
            System.out.println("cannot divide by 0");
        }
        
        System.out.println("Hello");

    }
    
}