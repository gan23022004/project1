import java.util.Scanner;

/**
 * Created by student3 on 02.11.19.
 */
public class Funkchion {
    public static void main(String[] args) {
        HelloWorld();
        Scanner in=new Scanner(System.in);
        int a=in.nextInt()
        System.out.println(Add(a,b));;
        int b=in.nextInt();
        swap(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void HelloWorld()
    {
        System.out.println("Hello, world");
    }
    public static int Add(int x,int y)
    {
        return x+y;
    }
public static void swap(int x, int y)
{
int temp=x;
    x=y;
    y=temp;

}
