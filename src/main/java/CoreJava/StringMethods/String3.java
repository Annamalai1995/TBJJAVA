package CoreJava.Stringmethods;

public class String3 {
    public static void main(String[] args) {
        String a="vignesh";
        System.out.println(a.startsWith("v"));
        System.out.println(a.endsWith("h"));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(3));
        System.out.println(a.length());
        String s="Nothing more than happiness.happy the faces";
        String replace=s.replace("happy","feel");
        System.out.println(replace);
        String s1="Yusuf Loves Swetha";
        String s2=s1.replace("Yusuf","Teja");
        System.out.println(s2);


    }
}
