package CoreJava.Abstraction;

public class Implement2 extends Additionprogram{
    @Override
    public void ArithemeticOperator(int a, int b) {
        int c=a*b;
        System.out.println(c);
    }

    @Override
    public void additional(int a, int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Implement2 imple=new Implement2();
        imple.AdditionMethod(55,55);
        imple.ArithemeticOperator(55,55);
        imple.additional(15,65);

    }
}
