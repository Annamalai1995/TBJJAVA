package CoreJava.Exception;

import java.util.Scanner;

public class Purpose {
    public static void main(String[] args)
    {
        String collect="Priya dharsini";
        Scanner scan=new Scanner(System.in);
        try//condition block
        {
            System.out.println("please tell us which index you want");
            System.out.println(collect.charAt(scan.nextInt()));
        }
        catch(StringIndexOutOfBoundsException str)///exception handled block
        {
            System.out.println(str);
            System.out.println("index number should be less then"+collect.length());
            System.out.println(collect.charAt(scan.nextInt()));
        }
        finally
        {
            System.out.println("Thanks ");
        }
    }
}
