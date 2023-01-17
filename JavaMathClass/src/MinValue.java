import java.util.Scanner;
public class MinValue
{
    public static void main(String[] args)
    {
        int x,y;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Any two numbers:-");
        x=s.nextInt();
        y=s.nextInt();
        System.out.println("Minimum Number between x and y:-"+Math.min(x,y));
    }
}
