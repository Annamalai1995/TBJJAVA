package CoreJava.controlstmts;

public class elseif {
    public static void main(String[] args) {
        String name="Janani";
        String name1="bhuvna";
        String name2="janani";

        if(name==name1)
        {
            System.out.println("Janani");
        }
        else if(name==name2)
        {
            System.out.println("Shobika");

        }
        else if(name.equalsIgnoreCase(name2))
        {
            System.out.println("Bhuvna");
        }
        else {
            System.out.println("Tamil");
        }
    }
}
