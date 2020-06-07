import java.util.Scanner;

public class UserInput {

    public static void main(String [] args) {
        int yearOfBirth = getYearOfBirth();
        String name = getUserName();
    }

    public static String getUserName () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        input.close();
        return name;
    }
    public static int getYearOfBirth () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year of birth : ");
        int yearOfBirth = input.nextInt();
        input.nextLine();
        input.close();
        return yearOfBirth;
    }
}
