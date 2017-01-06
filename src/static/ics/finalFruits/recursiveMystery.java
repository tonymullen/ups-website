
public class recursiveMystery
{
    public static int myst(int n, int m) {
        int t = (m + m) / m;
        if (n <= 1) {
            return n;
        }
        return n * myst(n - t, m + n);
    }
}
