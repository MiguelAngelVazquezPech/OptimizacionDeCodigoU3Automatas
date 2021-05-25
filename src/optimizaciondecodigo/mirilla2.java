package optimizaciondecodigo;
public class mirilla2 {
    public void mirilla2error() {
        int i = 0;
        String j = "Linea 1";
        while (i < 3)
        {
            i += 1;
            System.out.println(j);
        }
    }
    public void mirilla2optimizacion() {
        int i = 0;
        while (i < 3)
        {
            i += 1;
            System.out.println("Hola");
            break;
        }
    }
}
