import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        int rev = 0, rem=0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter number to reverse: ");
        int num = scanner.nextInt();

        while (num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.printf("Revered number is: " +rev);



    }
}
