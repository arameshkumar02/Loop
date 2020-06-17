import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        int digit, rev=0, n;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number= scanner.nextInt();
        n=number;
        do {
            digit = number % 10;
            rev = (rev * 10) + digit;
            number = number / 10;
           }
        while (number!=0);
        System.out.println("The reverse of the number is: "+rev);

        if (n == rev)
            System.out.println("The number is a palindrome ");
        else
            System.out.println("The number is not a palindrome");

    }
}
