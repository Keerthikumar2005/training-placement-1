import java.util.Scanner;

public class ContactFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        StringBuffer formattedContact = new StringBuffer();
        formattedContact.append(lastName).append(", ").append(firstName).append(" (").append(phoneNumber).append(")");

        System.out.println("\nFormatted Contact: " + formattedContact);
        int lastNameIndex = formattedContact.indexOf(lastName);
        System.out.println("Index of Last Name: " + lastNameIndex);

        String formattedPhoneNumber = phoneNumber.replace(" ", "-");
        System.out.println("Phone Number with Dashes: " + formattedPhoneNumber);
    }
}
