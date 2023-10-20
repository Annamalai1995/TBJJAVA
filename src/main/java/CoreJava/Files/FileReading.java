package FundamentalJava.DemoMethodsandVariableTypes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReading
{
    public static void main(String[] args) throws IOException {
        File fileobj=new File("E:\\Sample.doc");

        FileInputStream fis=new FileInputStream(fileobj);

//        int mycontentsize=fis.available();
//        System.out.println(" my content size is :"+mycontentsize);

        byte[] obj=new byte[fis.available()];

        fis.read(obj);

        String myvalues=new String(obj);
        System.out.println("my file content is :"+myvalues);
        fis.close();

    }
}
