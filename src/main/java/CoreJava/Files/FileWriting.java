package FundamentalJava.DemoMethodsandVariableTypes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting
{
    public static void main(String[] args) throws IOException
    {
        File fileobj=new File("E:\\Sample.doc");
//        fileobj.createNewFile();
        FileOutputStream fos=new FileOutputStream(fileobj);
        Scanner scan=new Scanner(System.in);
        System.out.println(" please tell about your self");
        String content=scan.nextLine();
        fos.write(content.getBytes());
        fos.close();
    }
}
