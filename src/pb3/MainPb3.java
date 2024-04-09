package pb3;
import java.util.Scanner;

public class MainPb3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti nr. natural n: ");
        int n = scanner.nextInt();
        System.out.println("Divizorii nr. " + n + " sunt:");
        int nrDivizori = 0;
        for(int i = 1; i <= n; i++)
        {
            if( n % i == 0 )
            {
                nrDivizori++;
                System.out.println(i + " ");

            }
        }
        if(nrDivizori == 2)
        {
            System.out.println("Nr/ " + n + " este prim.");

        }
        else
        {
            System.out.println("Nr. " + n + " NU este prim!");
        }
        scanner.close();
    }
}
