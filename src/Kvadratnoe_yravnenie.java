import java.util.Scanner;

/**
 * Created by student3 on 12.10.19.
 */
public class Kvadratnoe_yravnenie {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a, b, c ;
        System.out.println("Введите а:");
        a=in.nextInt();
        System.out.println("Введите b:");
        b=in.nextInt();
        System.out.println("Введите c:");
        c=in.nextInt();
        int d=b*b-4*a*c;

        if (d>0) {
            double x1=(-b+Math.sqrt(d))/2*a;
            double x2=(-b-Math.sqrt(d))/2*a;
            System.out.println("x1="+x1+"x2="+x2);
        }
         else if (d==0)
        {
            double x=(-b)/(2*a);
            System.out.println("x="+x);
        }
        else System.out.println("Решений нет");
        }
    }

