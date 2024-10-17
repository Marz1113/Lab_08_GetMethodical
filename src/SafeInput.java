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

    /**
     * gets an int value from the user at the console with no constraint
     * @param pipe a Scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return an int of any value
     */

    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("you must enter a valid integer and not" + trash);
            }

        } while(!done);

        return retVal;
    }


    /**
     * gets a double value from the user at the console with no constraint
     * @param pipe a Scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return an int of any value
     */


    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("you must enter a valid double and not " + trash);
            }

        } while(!done);

        return retVal;
    }



    /**
     * gets an integer from the user via the console within a specified range
     *
     * @param pipe the scanner to use for input
     * @param prompt the prompt to tell the user what is required
     * @param low the inclusive low bound
     * @param high the inclusive high bound
     * @return an int within the specified range
     */


    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("you must enter a value within the range [" + low + " - " + high + "]: ");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("you must enter a valid integer and not " + trash);
            }

        } while(!done);

        return retVal;
    }
}
