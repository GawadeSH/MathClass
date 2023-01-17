import java.util.Scanner;
    public class MathClassExample
    {
        public static void main(String[] args)
        {
            int x;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Number:-");
            x = s.nextInt();

            //Logarithem of given value
            System.out.println("logarithm of x:-"+Math.log(x));


            //logarithm of given value when base is 10
            System.out.println("log10 of x is:-"+Math.log10(x));

            // return the log of x + 1
            System.out.println("log1p of x is: " +Math.log1p(x));

            // return a power of 2
            System.out.println("exp of x is: " +Math.exp(x));

            // return (a power of 2)-1
            System.out.println("expm1 of  is: " +Math.expm1(x));
        }


    }



