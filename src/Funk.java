import java.util.Scanner;

/**
 * Created by student3 on 02.11.19.
 */
public class Funk {


/**
 * Created by student3 on 02.11.19.
 */

    public static void main(String[] args) {
        HelloWorld();
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(Add(a,b));
        swap(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);

        System.out.println((Fact(6)+Fact(10))/(Fact(3)+Fact(2)));
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
public static long Fact(int n)
{
long F=1;
    for (int i=1;i<=n;i++) F*=i;
    return F;
}
}
