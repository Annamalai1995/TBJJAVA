package FundamentalJava.DemoMethodsandVariableTypes;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMaps
{
    public static void main(String[] args)
    {
//        HashMap<Integer,String>  details=new HashMap<>();
//
//        details.put(22,"Manojkumar");
//        details.put(27,"annamalai");
//        details.put(21,"Tamilasaran");
//
//        details.remove(27);
//        System.out.println(details);
//        System.out.println(details.get(22));




        TreeMap<String,Mobileshop> customer=new TreeMap<>();

        Mobileshop mobile1=new Mobileshop("ZOne Plue",24000,6);
        Mobileshop mobile2=new Mobileshop("AOppo",18000,8);
        Mobileshop mobile3=new Mobileshop("SRedmi",15000,4);
        Mobileshop mobile4=new Mobileshop("POppo1",15000,4);

      customer.put("Manojkumar",mobile1);
      customer.put("Bhuvana",mobile4);
      customer.put("Janani",mobile2);
      customer.put("Tamil",mobile3);

        for(Map.Entry newobject : customer.entrySet())
        {
            System.out.println("my Customer :"+newobject.getKey()+"\n my mobile details "+newobject.getValue());
        }
    }
}
