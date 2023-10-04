package CoreJava.Scannerclass;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=ss.next();
        System.out.println("MY name is"+name);
        System.out.println("Enter the age");
        int age=ss.nextInt();
        System.out.println("Age is"+age);
    }
}
