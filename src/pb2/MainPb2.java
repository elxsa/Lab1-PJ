package pb2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainPb2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("in.txt"));

            // variabilele pentru suma, media, val. min si val. max
            double suma = 0;
            double media;
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;
            int nrElem = 0;

            // citim numerele din fisier si calculam suma, media, val. min si val. max
            while (scanner.hasNextDouble()) {
                double numar = scanner.nextDouble();
                suma += numar;
                nrElem++;
                if (numar < min) {
                    min = numar;
                }
                if (numar > max) {
                    max = numar;
                }
            }
            if (nrElem != 0) {
                media = suma / nrElem;
            } else {
                media = 0; // in cazul care fisierul este gol
            }
            // afisare rezultate
            System.out.println("Suma numerelor: " + suma);
            System.out.println("Media numerelor: " + media);
            System.out.println("Valoarea minima: " + min);
            System.out.println("Valoarea maxima: " + max);
            FileWriter writer = new FileWriter("out.txt");
            writer.write("Suma numerelor: " + suma + "\n");
            writer.write("Media numerelor: " + media + "\n");
            writer.write("Valoarea minima: " + min + "\n");
            writer.write("Valoarea maxima: " + max + "\n");
            writer.close();
            scanner.close();
        } catch (IOException e) {
            System.out.println("Eroare la citirea/scrierea fisierului: " + e.getMessage());
        }
    }
}
