package pb5;
import java.util.Random;

public class MainPb5 {
    public static void main(String[] args){
        Random random = new Random();
        // generam nr. aleatoriu (intre 0-20)
        int nrGen = random.nextInt(21);
        System.out.println("Nr. generat este: " + nrGen);
        // initializare pt. primii 2 termeni din sirul Fibonacci
        int fib1 = 0;
        int fib2 = 1;
        while(fib2 < nrGen)
        {
            int urmFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = urmFib;
        }
        if(fib2 == nrGen)
        {
            System.out.println("Nr. " + nrGen + " apartine sirului lui Fibonacci.");
        }
        else
        {
            System.out.println("Nr. " + nrGen + " NU apartine sirului lui Fibonacci!");
        }
    }
}
