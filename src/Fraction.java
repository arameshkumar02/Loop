import java.util.Scanner;

public class Fraction
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
