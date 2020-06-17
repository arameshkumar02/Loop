import java.util.Scanner;

public class FirstAndLastDigit
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.printf("Enter five digit: ");
        int number= scanner.nextInt();
        int lastDigit= number%10;
        int fistDigit=number;

        while (fistDigit>=10)
        {
            fistDigit=fistDigit/10;
        }
        System.out.println("First Digit="+fistDigit);
        System.out.println("Last Digit="+lastDigit);
        System.out.println("sum="+(fistDigit+lastDigit));
    }
}
