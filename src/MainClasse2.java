import java.util.Scanner;

/**
 * Created by student3 on 12.10.19.
 */
public class MainClasse2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите число:");
        double x=in.nextDouble();
        if(x>0) System.out.println(x);
        else System.out.println(-x);
    }
}
