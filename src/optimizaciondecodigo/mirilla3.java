package optimizaciondecodigo;
public class mirilla3 {
    public void mirilla3error() {
        String str = "itsva";
        for (int z = 1; z < str.length(); z++)
        {
            char v = 'v';
            char c = str.charAt(z);
            if (c == v)
            {
                System.out.println("pass");
            } else
            {
                System.out.println(z);
            }
        }
    }
    public void mirilla3optimizado() {
        String str = "itsva";
        for (int n = 1; n < str.length(); n++)
        {
            char c = str.charAt(n);
            if (c == 'v')
            {
                System.out.println(n + 1);
                break;
            }
        }
    }
}

