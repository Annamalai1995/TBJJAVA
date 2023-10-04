package CoreJava.variable;

public class Demovariable {
    static  String ooty="Cooling place";  //static variable
    String coorg="to visit karnataka"; // global variable
    public void Haii()
    {
        String name="Tamil";       //local variable
        System.out.println(name);
        System.out.println(ooty);
        System.out.println(coorg);
    }

    public static void main(String[] args) {
        int data=40;  //Instance variable
        int data1=50;
        System.out.println(data);
        System.out.println(data1);
        System.out.println(ooty);

        //syntax to create object
        //classname objectname=new classname();
        Demovariable v= new Demovariable() ;
        v.Haii();


    }
}
