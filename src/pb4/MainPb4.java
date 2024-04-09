package pb4;
import java.util.Random;

public class MainPb4 {
    public static void main(String[] args){
        Random random = new Random();
        // generam 2 nr. aleatorii (intre 1-30)
        int nr1 = random.nextInt(30) + 1;
        int nr2 = random.nextInt(30) + 1;
        System.out.println("Nr. generate sunt: " + nr1 + " si " + nr2);
        int cmmdc = calculCMMDC(nr1, nr2);
        System.out.println("Cmmdc al nr. este: " + cmmdc);
    }
    // calcul CMMDC
    public static int calculCMMDC(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
