package CoreJava.controlstmts;

import java.util.Scanner;

public class Swith1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("tell us your fav laptop brand name");
        String brand=scan.nextLine();



        switch (brand)
        {
            case  "Hp" :
                System.out.println("your fav is HP");
                break;
            case "Lenovo":
                System.out.println("your fav is Levono");
                break;
            case "Acer":
                System.out.println("your fav is Acer");
                break;
            default:
                System.out.println("your favoriate is not matching");

        }
}
}

