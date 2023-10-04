package CoreJava.oops.Inheritance;

public class Journey extends SRT implements Travels,KPN {
    public void details()
    {
        System.out.println("Both the travels all over Tamilnadu to covered the bus");
    }

    @Override
    public void Sleeper() {
        System.out.println("Comfort the bus");
    }

    @Override
    public void Volvo() {
        System.out.println("Its a Costlest Bus in comfort level are high");
    }

    public static void main(String[] args) {
        Journey j= new Journey();
        j.details();
        j.Sleeper();
        j.Volvo9600();
        j.Volvo();
    }
}
