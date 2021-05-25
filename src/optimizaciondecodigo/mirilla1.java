package optimizaciondecodigo;
public class mirilla1 {
    public void mirilla1error() {
        int z1 = 0;
        while (z1 < 4)
        {
            z1 += 1;
            if (z1 == 3)
            {
                System.out.println(z1);
            } else
            {
                System.out.println("pass");
            }
        }
    }
    public void mirilla1optimizacion() {
        int z1 = 0;
        while (z1 < 4)
        {
            z1 += 1;
            if (z1 == 3)
            {
                System.out.println(z1);
                break;
            }
        }
    }
}
