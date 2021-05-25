package optimizaciondecodigo;

public class local1 {

    public void local1error() {
        int resta = 1 - 2;
        int x = 1;
        int y = 2;
        int b = 5;
        double c = ((x - y) + b) / 2;
        System.out.println(c);
    }
    public void local1optimizado() {
        int x = 1;
        int y = 2;
        int a = x + y;
        int b = 5;
        double c = (a + b) / 2;
        System.out.println(c);
    }
}
