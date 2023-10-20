package FundamentalJava.DemoMethodsandVariableTypes;

import java.util.LinkedList;

public class DemoLinkedList
{
    public static void main(String[] args)
    {
//        Linkedklist
        LinkedList<Character>  sectiondetails=new LinkedList<Character>();
        sectiondetails.add('A');
        sectiondetails.add('B');
        sectiondetails.add('C');
        sectiondetails.addFirst('D');
        sectiondetails.add(2,'E');
        sectiondetails.remove(2);
        sectiondetails.set(0,'a');
        System.out.println(sectiondetails);
        System.out.println(" my sectiondetails 2nd index is "+sectiondetails.get(2));
    }
}
