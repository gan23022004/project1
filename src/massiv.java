import java.util.Random;
import java.util.Scanner;

/**
 * Created by student3 on 26.10.19.
 */
public class massiv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] myArray = {1, 2, 3, 4, 5, 6};
        //ввод элементов массива вручную
        int[] mas1 = new int[10];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = in.nextInt();
        }
        for (int i = 0; i < mas1.length; i++) {
            System.out.print(mas1[i] + " ");

        }
        System.out.println();


        //ввод с использованием формулы
        int[] mas2 = new int[10];
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = 2 * i + 1;
            System.out.print(mas2[i] + " ");
        }
        System.out.println();
        // генерация с помощью генератора случайных чисел
        // 1 способ
        int[] mas3 = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < mas3.length; i++) {
            mas3[i] = rnd.nextInt(30);//числа от 0 до 29
            System.out.print(mas3[i] + " ");
        }
        System.out.println();
        // 2 способ
        int[] mas4 = new int[10];
        for (int i = 0; i < mas4.length; i++) {
    mas4[i]=(int)(Math.random()*30);
            System.out.print(mas4[i]+" ");

        }
        System.out.println();
    }
}