package CoreJava.Accessmodifier.Def.Prote;

public class Proct {
    protected void a()
    {

        System.out.println("sam");
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub 
        System.out.println("hello");
        Proct p = new Proct();
        p.a();
    }
}
