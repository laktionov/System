/**
 * Created by Сергей on 12.03.2017.
 */
public class Absence {
    public static void search() {
        double k = 0;
        for (double a = 0.01; a > 0; a -= 0.0001) {
            int l = 0;
            for (double y = 0; y <= 0.2; y += 0.0001) {
                if (((Math.abs(Set.f(plusx(y,a), y, k))) < 0.01) || ((Math.abs(Set.f(minusx(y,a), y, k))) < 0.01)) {
                    l++;
                }
            }
            if (l==0) {
                System.out.println("При k = 0 и a =" +a+ " система не имеет решений");
                a = 0;
            }
        }
    }
    public static double plusx(double y, double a){
        double plusx = 1/a *Math.sqrt((1.4*a*a+(y-0.1)*(y-0.1))/1.5)-0.1;
        return plusx;
    }

    public static double minusx(double y, double a){
        double minusx = -1/a *Math.sqrt((1.4*a*a+(y-0.1)*(y-0.1))/1.5)-0.1;
        return minusx;
    }
}
