package CoreJava.Exception;

import java.io.IOException;
public class throws2 {
    void numcheck(int num) throws IOException,ClassNotFoundException
    {
        if(num==1)
        {
           throw new IOException("Io exception");
         //   System.out.println("hello");

        }
        else

        {
            throw new ClassNotFoundException("class not found exception");

        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        throws2 h = new throws2();
        try
        {
            h.numcheck(1);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

}
