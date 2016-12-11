/**
 * Created by Constantin on 20.11.2016.
 */
public class lw03 {
    public lw03() {
    }

    public static void main(String[] var0) {
        double[] var1 = new double[100];

        for(int var2 = 0; var2 < 100; ++var2) {
            var1[var2] = (double)var2;
        }

        matematica var2 = new matematica();
        System.out.println(var2.logika(3.0D, 90.0D, 8.0D));
        var2.poka(90.0D);
        var2.massivy(var1, 25, 60);
    }
}
