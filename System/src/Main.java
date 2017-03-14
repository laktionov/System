/**
 * Created by Сергей on 09.03.2017.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Метод Ньютона решения систем нелинейных уравнений");
        System.out.println("cos(ky+x^2) + x^2 + y^2 - 1.6 = 0");
        System.out.println("1.5(x+0.1)^2 - 1/a^2 *(y-0.1)^2 - 1.4 = 0");
        System.out.println();
        System.out.println("Введите номер задания");
        System.out.println();
        int j = in.nextInt();
        if (j == 1) {
            Set.solve();
        }
        if (j == 2) {
            Absence.search();
        }
    }
}
