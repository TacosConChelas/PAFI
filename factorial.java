import java.util.Scanner;
public class factorial {
    public static int factorial(int n){
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
        
    }
    public static void main(String[] args) {
        Scanner leeScanner = new Scanner(System.in);
        System.out.println("Escribel numero que quieres calcular el factorial");

        int n = leeScanner.nextInt();
        System.out.println("el factorial del numero es " + factorial(n));

        leeScanner.close();
    }
}

