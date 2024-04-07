import java.util.Scanner;
public class Recurcividad_sucession {
    public static void acendente(int n, int num){
        if (n == num) {
            System.out.print(n + ".");
        } else {
            System.out.print(n + ", "); acendente((n + 1), num);
        }
    }
    public static void decendente(int n){
        if (n == 0) {
            System.out.print(n + ".");
        } else {
            System.out.print(n + ", "); decendente(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner tacoScanner = new Scanner(System.in);   byte option; int num;

        System.out.println("Escribe el numero n al que se le ba a aplicar la sucesion");
        num = tacoScanner.nextInt();
        System.out.println("Escribe el numero segun el inciso que decees ejecutar");
        System.out.println("1) Sunecion acendente (desde 0 a n)\n2) Sucesion decentente (desde n a 0)");
        option = tacoScanner.nextByte();

        switch (option) {
            case 1:
                acendente(0, num);
                break;
            case 2:
                decendente(num);
                break;
            default: System.out.println("La opcion que ingresaste es incorrecta");break;

        }   
        tacoScanner.close();
    }
}
