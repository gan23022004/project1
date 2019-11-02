import java.util.Random;

/**
 * Created by student3 on 02.11.19.
 */
public class NerovMas {
    public static void main(String[] args) {
        int[][] mas=new int[5][];
        Random rnd=new Random();
        for (int i=0;i<mas.length;i++)
        {
            int k=rnd.nextInt(10)+1;
            mas[i]=new int[k];
        }
        for (int i=0;i<mas.length;i++)
        {
            for (int j=0;j<mas[i].length;j++)
            {
                mas[i][j]=rnd.nextInt(10);
                System.out.print(mas[i][j]+" ");
            }
            System.out.println();
        }
    }
}
