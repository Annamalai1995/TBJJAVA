package CoreJava.ArrayCRUDL;


import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        String [] Actress= {"Samantha","Trisha","Rashmika","Rashikanna","Gowthamipriya","priya","Anjali  "};
        Scanner scan=new Scanner(System.in);

        System.out.println(Actress.length);
        System.out.println("Tell us What is Your favoriate actor");
        String favor=scan.next();

        for(int pos=0;pos<Actress.length;pos++)
        {
            if(favor.equalsIgnoreCase(Actress[pos]))
            {
                System.out.println(favor+" Actress is founded");
                return;
            }
		//else
		//	{
		//		System.out.println(favor+" actress is not founded");
		//	}
        }
        System.out.println(favor   +" actress is not founded");
    }
    }

