package CoreJava.Stringmethods;

public class Concat {
    public static void main(String[] args) {
        String s="vignesh"+"Weds"+"Dhanushiya"+"weds"+"vicky";  //concatenation
        System.out.println(s);
        String ss="vignesh";
        String ss1="Dhanusiya";
        String ss2="Sowmya";
        System.out.println(ss+ss1);
        System.out.println(ss.concat(ss));
        System.out.println(ss1.concat(ss2));

    }
}
