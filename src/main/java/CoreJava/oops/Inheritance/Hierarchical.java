package CoreJava.oops.Inheritance;

class Father
{
    public void family()
    {
        String name="Sundaramoorthy";
        String mother="Jayanthi";
        System.out.println(name);
        System.out.println(mother);
    }
}

class child extends  Father
{
    public void detail()
    {
        String Sname="Annamalai";
        String crushname="Gowthamipriya";
        System.out.println(Sname);
        System.out.println(crushname);
    }
}
class realtives extends Father
{
    public void Relativedetails()
    {
        int age=26;
        String Rname="SchlCrush";
        System.out.println(age);
        System.out.println(Rname);
    }
}
public class Hierarchical {
    public static void main(String[] args) {
//        Father f= new Father();
//        f.family();
        // realtives r = new realtives();
        //r.Relativedetails();
        //r.family();
        //child c = new child();
        // c.detail();
        realtives r = new realtives();
        r.family();
        r.Relativedetails();
        child c = new child();
        c.detail();


    }


}
