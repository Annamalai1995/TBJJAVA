package FundamentalJava.DemoMethodsandVariableTypes;

import java.util.Stack;

public class DemoStack
{
    public static void main(String[] args)
    {
        Stack<Integer> ages=new Stack<Integer>();

        ages.push(20);
        ages.push(21);
        ages.push(22);
        ages.push(23);

        System.out.println(ages);

        ages.pop();//last element only deleted
        System.out.println(ages);

        System.out.println("my object top value is :"+ages.peek());
        System.out.println(" my value is 20 === "+ages.search(20));
    }
}
