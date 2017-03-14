/**
 * Created by Сергей on 09.03.2017.
 */
public class Set {
    public static void solve() {
        for (double a = 0.6; a <= 1.6; a += 0.2) {
            for (double k = 0.6; k <= 1; k += 0.1) {
                System.out.println("a="+a +"; k="+k);
                System.out.println();
                System.out.print("M" + "  ");
                System.out.print("         " + "xM" + "        ");
                System.out.print("         " + "yM" + "        ");
                System.out.print("       " + "f(xM,yM)" + "       ");
                System.out.print("       " + "g(xM,yM)" + "       ");
                System.out.println();
                int l = 0;
                for (double x = -2; x <= 0; x += 0.05) {
                    for (double y = 0; y <= 2; y += 0.05) {
                        if ((Math.abs(f(x, y, k)) < 0.1) && (Math.abs(g(x, y, a)) < 0.1) && (l==0)) {
                            double x0 = x;
                            double y0 = y;
                            int M = 0;
                            System.out.print(M + "  ");
                            System.out.print(x0 + "  ");
                            System.out.print(y0 + "  ");
                            System.out.print(f(x0, y0, k) + "  ");
                            System.out.print(g(x0, y0, a));
                            System.out.println();
                            while ((Math.abs(f(x0, y0, k)) > 0.000001) && (Math.abs(g(x0, y0, a)) > 0.000001)) {
                                double x1 = x0 + det1(x0, y0, k, a) / jacobian(x0, y0, k, a);
                                double y1 = y0 + det2(x0, y0, k, a) / jacobian(x0, y0, k, a);
                                x0 = x1;
                                y0 = y1;
                                M++;
                                System.out.print(M + "  ");
                                System.out.print(x1 + "  ");
                                System.out.print(y1 + "  ");
                                System.out.print(f(x1, y1, k) + "  ");
                                System.out.print(g(x1, y1, a));
                                System.out.println();
                            }
                            l++;
                            System.out.println();
                        }
                    }
                }

                l=0;
                for (double x = -2; x <= 0; x += 0.05) {
                    for (double y = -2; y <= 0; y += 0.05) {
                        if ((Math.abs(f(x, y, k)) < 0.1) && (Math.abs(g(x, y, a)) < 0.1) && (l==0)) {
                            double x0 = x;
                            double y0 = y;
                            int M = 0;
                            System.out.print(M + "  ");
                            System.out.print(x0 + "  ");
                            System.out.print(y0 + "  ");
                            System.out.print(f(x0, y0, k) + "  ");
                            System.out.print(g(x0, y0, a));
                            System.out.println();
                            while ((Math.abs(f(x0, y0, k)) > 0.000001) && (Math.abs(g(x0, y0, a)) > 0.000001)) {
                                double x1 = x0 + det1(x0, y0, k, a) / jacobian(x0, y0, k, a);
                                double y1 = y0 + det2(x0, y0, k, a) / jacobian(x0, y0, k, a);
                                x0 = x1;
                                y0 = y1;
                                M++;
                                System.out.print(M + "  ");
                                System.out.print(x1 + "  ");
                                System.out.print(y1 + "  ");
                                System.out.print(f(x1, y1, k) + "  ");
                                System.out.print(g(x1, y1, a));
                                System.out.println();
                            }
                            l++;
                            System.out.println();
                        }
                    }
                }

                l=0;
                for (double x = 0; x <= 2; x += 0.05) {
                    for (double y = 0; y <= 2; y += 0.05) {
                        if ((Math.abs(f(x, y, k)) < 0.1) && (Math.abs(g(x, y, a)) < 0.1) && (l==0)) {
                            double x0 = x;
                            double y0 = y;
                            int M = 0;
                            System.out.print(M + "  ");
                            System.out.print(x0 + "  ");
                            System.out.print(y0 + "  ");
                            System.out.print(f(x0, y0, k) + "  ");
                            System.out.print(g(x0, y0, a));
                            System.out.println();
                            while ((Math.abs(f(x0, y0, k)) > 0.000001) && (Math.abs(g(x0, y0, a)) > 0.000001)) {
                                double x1 = x0 + det1(x0, y0, k, a) / jacobian(x0, y0, k, a);
                                double y1 = y0 + det2(x0, y0, k, a) / jacobian(x0, y0, k, a);
                                x0 = x1;
                                y0 = y1;
                                M++;
                                System.out.print(M + "  ");
                                System.out.print(x1 + "  ");
                                System.out.print(y1 + "  ");
                                System.out.print(f(x1, y1, k) + "  ");
                                System.out.print(g(x1, y1, a));
                                System.out.println();
                            }
                            l++;
                            System.out.println();
                        }
                    }
                }

                l=0;
                for (double x = 0; x <= 2; x += 0.05) {
                    for (double y = -2; y <= 0; y += 0.05) {
                        if ((Math.abs(f(x, y, k)) < 0.1) && (Math.abs(g(x, y, a)) < 0.1) && (l==0)) {
                            double x0 = x;
                            double y0 = y;
                            int M = 0;
                            System.out.print(M + "  ");
                            System.out.print(x0 + "  ");
                            System.out.print(y0 + "  ");
                            System.out.print(f(x0, y0, k) + "  ");
                            System.out.print(g(x0, y0, a));
                            System.out.println();
                            while ((Math.abs(f(x0, y0, k)) > 0.000001) && (Math.abs(g(x0, y0, a)) > 0.000001)) {
                                double x1 = x0 + det1(x0, y0, k, a) / jacobian(x0, y0, k, a);
                                double y1 = y0 + det2(x0, y0, k, a) / jacobian(x0, y0, k, a);
                                x0 = x1;
                                y0 = y1;
                                M++;
                                System.out.print(M + "  ");
                                System.out.print(x1 + "  ");
                                System.out.print(y1 + "  ");
                                System.out.print(f(x1, y1, k) + "  ");
                                System.out.print(g(x1, y1, a));
                                System.out.println();
                            }
                            l++;
                            System.out.println();
                        }
                    }
                }
            }
        }
    }

    public static double f(double x, double y, double k) {
        double f = Math.cos(k * y + x * x) + x * x + y * y - 1.6;
        return f;
    }

    public static double fx(double x, double y, double k) {
        double fx = -2 * x * Math.sin(k * y + x * x) + 2 * x;
        return fx;
    }

    public static double fy(double x, double y, double k) {
        double fy = -k * Math.sin(k * y + x * x) + 2 * y;
        return fy;
    }

    public static double g(double x, double y, double a) {
        double g = 1.5*Math.pow(x+0.1 , 2)- Math.pow(y-0.1,2)/(a*a) - 1.4;
        return g;
    }

    public static double gx(double x, double y, double a) {
        double gx = 3*(x+0.1);
        return gx;
    }

    public static double gy(double x, double y, double a) {
        double gy = -2/(a*a)*(y-0.1);
        return gy;
    }

    public static double det1(double x, double y, double k, double a) {
        double det1 = -f(x,y,k)*gy(x,y,a)+g(x,y,a)*fy(x,y,k);
        return det1;
    }

    public static double det2(double x, double y, double k, double a) {
        double det1 = -g(x, y, a) * fx(x, y, k) + f(x, y, k) * gx(x, y, a);
        return det1;
    }

    public static double jacobian(double x, double y, double k, double a) {
        double jacobian = fx(x,y,k)*gy(x,y,a)-fy(x,y,k)*gx(x,y,a);
        return jacobian;
    }
}
