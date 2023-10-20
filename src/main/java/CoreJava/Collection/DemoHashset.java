package FundamentalJava.DemoMethodsandVariableTypes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoHashset
{
    public static void main(String[] args)
    {
        TreeSet<Mobileshop> Poorvika=new TreeSet<Mobileshop>();

        Mobileshop mobile1=new Mobileshop("ZOne Plue",24000,6);
        Mobileshop mobile2=new Mobileshop("AOppo",18000,8);
        Mobileshop mobile3=new Mobileshop("SRedmi",15000,4);
        Mobileshop mobile4=new Mobileshop("POppo1",15000,4);

        Poorvika.add(mobile1);
        Poorvika.add(mobile3);
        Poorvika.add(mobile2);
        Poorvika.add(mobile4);
        Iterator it=Poorvika.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next()+" \n");
        }
    }
}

@Data//getter setter method and To String
@NoArgsConstructor//default constructor
@AllArgsConstructor//parameterized constructor
class Mobileshop implements Comparable<Mobileshop>
{
    String MobileBrand;
    double MobilePrice;
    int MobileRam;
    @Override
    public int compareTo(Mobileshop o)
    {
        return o.MobileBrand.compareTo(MobileBrand);
    }
}