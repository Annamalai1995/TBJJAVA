package CoreJava.Exception;

public class throws1 {
    public static void limit(int age)
    {
        if(age>=18)
        {
            throw new ArithmeticException("not valid");
        }else
        {
            System.out.println("AGE IS VALID ");
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        limit(20);
        System.out.println("KISHORE AND SARAN");

    }

}
