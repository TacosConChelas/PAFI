import java.util.Scanner;
public class P1 {
    public static float sumar(float a, float b){ 
        
        return a + b; 
        
    }
    public static float resta(float a, float b){ return (a - b); }
    public static float multiplicar(float a, float b){ return (a * b); }
    public static float divicion(float a, float b){ return (a / b); }

    public static void main(String[] args) {
        Scanner tacoScanner = new Scanner(System.in);
        int a; float res = 0, n1, n2;
        System.out.println("1)Suma \n2)Resta \n3)Multiplicacion \n4)Divicion");
        System.out.println("Escribe la operación que quieras realizar  escribiendo su numero correspondiente");
        a = tacoScanner.nextInt();
        System.out.println("ingresa 1 los numero");
        n1 = tacoScanner.nextFloat();
        System.out.println("ingresa 1 los numero");
        n2 = tacoScanner.nextFloat();
        switch (a) {
            case 1:
                res = sumar(n1, n2);    break;
            case 2:
                res = resta(n1, n2);    break;
            case 3:
                res = multiplicar(n1, n2);  break;
            case 4:
                res = divicion(n1, n2);     break;
            default:
            System.out.println("numero no valido");     break;
        }
        System.out.println("El resultado es: " + res);
        tacoScanner.close();
    }
}