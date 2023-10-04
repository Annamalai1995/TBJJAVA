package CoreJava.controlstmts;

import java.util.Scanner;

public class ifelsestmts {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter the Crushname");
        // int age = 0;
        String cname=ss.next();
        if(cname.equalsIgnoreCase("priya"))
        {
            // System.out.println(age1);
            System.out.println("You got the crusname");
        }
        else {
            System.out.println("Not Eligible ");
        }
    }
}

