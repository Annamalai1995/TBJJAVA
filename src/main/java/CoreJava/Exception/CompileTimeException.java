package CoreJava.Exception;

import java.io.IOException;

public class CompileTimeException {
    public static void main(String[] args) throws IOException, InterruptedException, IOException {
        Runtime run=Runtime.getRuntime();
        Process pro;
        pro =run.exec("notepad");
        Thread.sleep(5000);
        pro=run.exec("calc");


    }
}
