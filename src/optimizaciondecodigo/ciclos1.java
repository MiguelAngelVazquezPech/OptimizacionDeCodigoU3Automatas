package optimizaciondecodigo;
public class ciclos1 {
    public void ciclos1error() {
        int resultado;
        for (int i = 0; i < 10; i++)
        {
            int k, m;
            k = 2;
            m = 1;
            resultado = i * k + m;
            System.out.println(resultado);
        }
    }
    public void ciclos1optimizado() {
        int resultado, m, k;
        m = 2;
        k = 3;
        int count = m;
        for (int i = 0; i < 10; i++)
        {
            resultado = count;
            count += k;
            System.out.println(count);
        }
    }

}
