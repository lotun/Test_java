import java.util.Scanner;

/**
 * Created by Alex on 10.03.2017.
 */

public class dz1 {
    public static void main (String args []) {
        long a = 0,b = 0,c = 0;
        double x1,x2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите начение a: ");
        while (sc.hasNextLong()){
            a = sc.nextLong();
            if(a==0) {
                System.out.print("Первый коэффициент не может быть 0, введите значение еще раз: ");
                continue;
            }
            else {

                break;
            }
        }
        System.out.print("Введите начение b: ");
        if(sc.hasNextLong()) {  // возвращает истинну если с потока ввода можно считать целое число
            b = sc.nextLong();
        }
        System.out.print("Введите начение c: ");
        if(sc.hasNextLong()) {  // возвращает истинну если с потока ввода можно считать целое число
            c = sc.nextLong();
        }

        double d = dis(a,b,c);
        if (d<0){
            System.out.print("Нет действительных решений уравнения");
        }
        if (d==0){
            x1=-(b/2*a);
            System.out.print("Решение уравнение x = ");
            System.out.print(x1);
        }
        if (d>0){
            x1=(-b+Math.pow(b*b-4*a*c, 0.5))/2*a;
            x2=(-b-Math.pow(b*b-4*a*c, 0.5))/2*a;
            System.out.printf("Уровнение имеет два корня %.0f и %.0f", x1, x2);
        }

    }
    private static double dis(long a,long b,long c){
        return b*b - 4*a*c;
    }

}
