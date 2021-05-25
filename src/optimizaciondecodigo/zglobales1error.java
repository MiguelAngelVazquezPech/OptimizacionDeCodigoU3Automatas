package optimizaciondecodigo;
import java.util.Scanner;
public class zglobales1error {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        try
        {
            return (a / b);
        } catch (ArithmeticException aExp)
        {
            System.out.println("division by zero exception");
            System.out.println("inside-catch");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = x.nextInt();
        System.out.print("Ingrese otro numero: ");
        int b = x.nextInt();
        System.out.println("La suma es: " + suma(a, b));
        System.out.println("La resta es: " + resta(a, b));
        System.out.println("La multiplicacion es: " + multi(a, b));
        System.out.println("La divicion es: " + div(a, b));

    }
}
