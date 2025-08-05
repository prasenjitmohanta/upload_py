public class nestedTry{
    public static void main(String args[]){
        try{//outer try block
            int  a = Integer.parseInt(args[0]);
            int  b = Integer.parseInt(args[1]);
            int ans =0;
            try{
                ans=a/b;
                System.out.println("the result is "+ans);

            }
            catch(ArithmeticException e){
                System.out.println("Divided by zero!!");
            }
        }
        catch(NumberFormatException e){
            System.out.println("Incorrect type of data!!");
        }
    }
}
