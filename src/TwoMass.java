import java.util.Random;

/**
 * Created by student3 on 02.11.19.
 */
public class TwoMass {
    public static void main(String[] args) {
        int[][] mas = new int[4][4];
        Random rnd = new Random();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rnd.nextInt(11) - 5;
                System.out.print(mas[i][j] + " ");
                if (mas[i][j]<min) min=mas[i][j];
            }
            System.out.println();
        }
        System.out.println(min);
        min = Integer.MAX_VALUE;
        for (int i=0;i<mas.length;i++)
        {
            for (int j=0;j<mas[i].length;j++)
            {
                if (mas[i][j]%2==0) mas[i][j]*=2;
                else mas[i][j]*=3;
                if (mas [i][j]<min) min=mas[i][j];
                System.out.println(mas[i][j]);
            }
            System.out.println();
        }
        System.out.println(min);
    }
}