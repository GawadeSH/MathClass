import java.util.Scanner;
public class PowerValue
{
    public static void main(String[] args)
    {
        int x,y;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number:-");
        x=s.nextInt();
        System.out.println("Enter power:-");
        y=s.nextInt();
        System.out.println("power of x is:-"+Math.pow(x,y));

    }
}
