package CoreJava.Scannerclass;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter value 1");
        int add1=ss.nextInt();

        System.out.println("Enter the value 2");
        int add2=ss.nextInt();
        int result=add1+add2;
        System.out.println("The Result is "+result);
    }
}
