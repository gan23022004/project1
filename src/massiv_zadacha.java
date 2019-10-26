import java.util.Random;
import java.util.Scanner;

/**
 * Created by student3 on 26.10.19.
 */
public class massiv_zadacha {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] mas=new int[10];
        int n=in.nextInt();
        Random rnd=new Random();
        int last=-1;
        int k=0;
        for (int i=0; i<mas.length;i++)
        {
            mas[i]=rnd.nextInt(15)-7;
            System.out.print(mas[i]+" ");
            if (mas[i]==n) last=i;
            if (mas[i]<n) k++;
                    }
        System.out.println();
        System.out.println(last);
        System.out.println(k);
    }
}
