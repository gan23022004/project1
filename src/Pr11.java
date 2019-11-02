import java.util.Random;
import java.util.Scanner;

/**
 * Created by student3 on 02.11.19.
 */
public class Pr11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] mas=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Random rnd=new Random();
        for (int i=0;i<mas.length;i++) {
            mas[i]=rnd.nextInt(21)-10;
            System.out.print(mas[i]+" ");
            if (mas[i]>max) max=mas[i];
            if (mas[i]<min) min=mas[i];


        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }
}
