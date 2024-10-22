import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = getRegExString(in, "enter your ssn (***-**-****): ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("ssn: " + ssn);

        String mNum = getRegExString(in, "enter your m number (M#####): ", "^(M|m)\\d{5}$");
        System.out.println("m number: " + mNum);

        String menuChoice = getRegExString(in, "enter your choice [O/S/V/Q]: ", "^[OoSsVvQq]$");
        System.out.println("menu choice: " + menuChoice);
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        boolean valid = false;
        do {
            System.out.print(prompt);
            input = pipe.nextLine().trim();
            if (input.matches(regEx)) {
                valid = true;
            } else {
                System.out.println("invalid.");
            }
        } while (!valid);
        return input;
    }

}
