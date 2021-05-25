package optimizaciondecodigo;
public class ciclos3 {
    public void ciclos3error() {
        int a = 0;
        int b[] ={0, 1, 2, 3, 4};
        for (a=0; a < b[4]; a++)
        {
            System.out.print("Java");
        }
    }
    public void ciclos3optimizado() {
        int b[] ={0, 1, 2, 3, 4};
        for (int a = 0; a < b.length; a++)
        {
            System.out.print("Java");
        }
    }
}

