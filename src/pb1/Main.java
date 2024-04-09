package pb1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // citim lungimea si latimea de la tastatura
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti lungimea dreptunghiului: ");
        double lungime = scanner.nextDouble();
        System.out.print("Introduceti latimea dreptunghiului: ");
        double latime = scanner.nextDouble();

        // calculam perimetrul si aria dreptunghiului

        double perimetru = 2 * (lungime + latime);
        double arie = lungime * latime;

        // afisam perimetrul si aria

        System.out.println("Perimetrul dreptunghiului este: " + perimetru);
        System.out.println("Aria dreptunghiului este: " + arie);

    }
}

