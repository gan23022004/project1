import java.util.Random;
import java.util.Scanner;

/**
 * Created by student3 on 02.11.19.
 */
public class Pr12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] mas=new int[n];
        Random rnd=new Random();
        int s=0;
        for (int i=0; i<mas.length;i++)
        {
            mas[i]=rnd.nextInt(25)-13;
            System.out.println(mas[i]+" ");
            s+=mas[i];
        }
        System.out.println(s);

    }
}
