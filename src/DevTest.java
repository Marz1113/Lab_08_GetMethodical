import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";

        firstName = getNonZeroLenString(in, "Enter your first name");

        System.out.println("Fname is " + firstName);
    }

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if(retVal.isEmpty())
                System.out.println("must enter at least one character.");


        } while(retVal.isEmpty());

        return retVal;
    }
}