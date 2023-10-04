package CoreJava.Exception;

public class throw1 {


        void vote(int age )
        {
            if(age > 18)
            {
                throw new ArithmeticException("You are  not eligible");
            }
            else
            {
                System.out.println(" eligible");
            }
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            throw1 tt= new throw1();
            tt.vote(10);


        }

}

