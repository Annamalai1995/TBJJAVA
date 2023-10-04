package CoreJava.Stringmethods;
import java.lang.StringBuffer;
public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("vignesh");// original

        //Append
        s.append("kumar");// append string
        System.out.println(s);

        //insert
        s.insert(9,"sam");
        System.out.println(s);
        //replace
        s.replace(1, 3, "hello");
        System.out.println(s);
        s.delete(1, 2);
        System.out.println(s);
        s.reverse();
        System.out.println(s);

        java.lang.StringBuffer ss= new java.lang.StringBuffer("MALAI");
        ss.delete(0,3);
        System.out.println(ss);
    }
}
