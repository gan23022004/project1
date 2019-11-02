import java.util.Random;
import java.util.Scanner;

/**
 * Created by student3 on 02.11.19.
 */
public class Pr13 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] mas=new int[n];
        Random rnd=new Random();
        int k=0;
        int p=1;
        for (int i=0; i<mas.length;i++)
        {
            mas[i]=rnd.nextInt(46)-19;
            System.out.println(mas[i]+" ");
            if (i%2!=0) p*=mas[i];
            if (mas[i]==0) k++;
        }
        System.out.println(p);
        System.out.println(k);

    }
}
