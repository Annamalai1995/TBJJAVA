package CoreJava.controlstmts;

import java.util.Scanner;

public class Elseif1 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the Cooling Place");
        String place = ss.nextLine();
        //System.out.println(place);
        String place1 = ss.nextLine();
        //System.out.println("Enter tthe place");
        if(place1.equalsIgnoreCase("ooty"))
        {
            System.out.println("OOTY ");
        }
        else if(place1.equalsIgnoreCase("Kodaikanal"))
        {
            System.out.println("Kodaikanal");
        }
        else if((place.equalsIgnoreCase("Manali"))||(place1.equalsIgnoreCase("Kashmir")))
        {
            System.out.println("Manali Best pace to go");


        }
        else {
            System.out.println("kashmir");
        }

    }

}
