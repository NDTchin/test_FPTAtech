import java.util.ArrayList;
import java.util.Scanner;

public class AddressBooksManager {
    private static ArrayList<Contacts> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void addContacts() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your company: ");
        String company = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your phone: ");
        String phone = scanner.nextLine();
        Contacts contact = new Contacts(name, company, email, phone);
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public static void findContacts() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Contacts contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Phone number for " + name + contact.getPhone());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found!");
        }
    }

    public void displayContacts() {
        System.out.println("Address Book Contacts:");
        System.out.println("__________________________________________");
        System.out.println("| Name         | Company          | Email               | Phone             |");
        for (Contacts contact : contacts) {
            System.out.printf("| %-50s | %-50s | %-25s | %-10s |\n", contact.getName(), contact.getCompany(), contact.getEmail(), contact.getPhone());
        }
        System.out.println("__________________________________________");
        if (contacts.isEmpty()) {
            System.out.println("No contacts found in AddressbookManager!");
        }
    }
}
