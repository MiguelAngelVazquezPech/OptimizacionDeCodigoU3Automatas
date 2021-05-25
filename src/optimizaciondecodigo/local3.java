package optimizaciondecodigo;

public class local3 {

    public void local3error() {
        int i;
        i = 3 + 2;
        System.out.println(i);
    }

    public void local3optimizado() {
        int i = 3;
        int j = i + 2;
        System.out.println(j);
    }

}
