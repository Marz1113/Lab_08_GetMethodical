import java.util.Scanner;



public class SafeInput {

    {

        Scanner in = new Scanner(System.in);
        String firstName = "";

        firstName = getNonZeroLenString(in, "Enter your first name");

        System.out.println("Fname is " + firstName);
    }

    /**
     * gets a string from the user using the console
     * It must be at least one character in length
     * @param pipe a Scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return A string of at least one character in length
     */

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
