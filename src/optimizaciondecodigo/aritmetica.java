package optimizaciondecodigo;
public class aritmetica {
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
}
