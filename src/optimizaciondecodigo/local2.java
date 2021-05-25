package optimizaciondecodigo;
public class local2 {
    public void local2error() {
        int a = 3;
        int b = 2;
        int c = 1;
        int d = a + c;
        double e = b / c * a;
        double x = a + c + (b / c * a);
        System.out.println(x);
    }
    public void local2optimizado() {
        int a = 3, b = 2, c = 1;
        int d = a + c;
        double e = b / d;
        double x = d + e;
        System.out.println(x);
    }
}
