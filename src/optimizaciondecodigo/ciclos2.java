package optimizaciondecodigo;
public class ciclos2 {
    public void ciclos2error() {
        for (int i = 0; i < 10; i++)
        {
            int p, s, rs, rd;
            p = 2;
            s = 2;

            if (p == s)
            {
                rs = 1 * i;
            } else
            {
                rd = 2 * i;
            }
        }
    }
    public void ciclos2optimizado() {
        int p = 2;
        int s = 2;
        int rs, rd;
        if (p == s)
        {
            for (int i = 0; i < 10; i++)
            {
                rs = 1 * i;
            }
        } else
        {
            for (int i = 0; i < 10; i++)
            {
                rd = 2 * i;
            }
        }
    }
}
