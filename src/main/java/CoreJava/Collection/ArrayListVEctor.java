package FundamentalJava.DemoMethodsandVariableTypes;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListVEctor
{
    public static void main(String[] args)
    {
        ArrayList personaldetails=new ArrayList();

        personaldetails.add("Manojkkumar");
        personaldetails.add(22);
        personaldetails.add('M');
        personaldetails.add(63.45);
        personaldetails.add(9789355930l);
        personaldetails.add(true);

        Vector studentdetails=new Vector();

        studentdetails.addAll(personaldetails);
        studentdetails.add("From Namakkal");
        studentdetails.add(166.7f);
        studentdetails.add("Manojkkumar");

        System.out.println("my arraylist values : "+personaldetails);
        System.out.println(" my vector values :"+studentdetails);

//        studentdetails.removeAll(personaldetails);//

        studentdetails.retainAll(personaldetails);

        System.out.println(" my vector values :"+studentdetails);

    }
}
