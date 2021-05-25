package optimizaciondecodigo;

import java.util.Scanner;
import optimizaciondecodigo.aritmetica.*;

public class zglobales1optimizado {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = x.nextInt();
        System.out.print("Ingrese otro numero: ");
        int b = x.nextInt();
        System.out.println("La suma es: " + aritmetica.suma(a, b));
        System.out.println("La resta es: " + aritmetica.resta(a, b));
        System.out.println("La multiplicacion es: " + aritmetica.multi(a, b));
        System.out.println("La divicion es: " + aritmetica.div(a, b));
    }
}
