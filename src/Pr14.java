import java.util.Random;
import java.util.Scanner;

/**
 * Created by student3 on 02.11.19.
 */
public class Pr14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] mas=new int[n][n];
        Random rnd=new Random();
        int s=0;
        for (int i=0; i<mas.length; i++)
        {
            for(int j=0;j<mas[i].length;j++)
            {
                mas[i][j]=rnd.nextInt(7)-3;
                if (i==j) s+=mas[i][j];
                System.out.println(mas[i][j]);
            }
        }
        System.out.println((float)s/n);
        for (int i=0; i<mas.length;i++){
            for (int j=0;j<mas[i].length;j++)
            {
                if (mas[i][j]<0) mas[i][j]=Math.abs(mas[i][j]);
                if(i==j) s+=mas [i][j];
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
        System.out.println((float)s/n);
    }
}
