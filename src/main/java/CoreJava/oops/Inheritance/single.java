package CoreJava.oops.Inheritance;
class Lion
{
    public void Hunt()
    {
        System.out.println("Lion hunt the animals");
    }
}
class polarBear extends Lion{
    public void  Ice()
    {
        System.out.println("Polar Bear is the survive of cooling places");
    }
}
public class single {


    public static void main(String[] args) {
        polarBear p = new polarBear();
        p.Ice();
        p.Hunt();

    }
}
