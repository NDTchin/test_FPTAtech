import java.util.Scanner;

public class MainAddressBooks {
    public static void main(String[] args) {
        createMenu();
    }
    public static void createMenu() {
        AddressBooksManager addressBooks = new AddressBooksManager();
        Scanner scanner = new Scanner(System.in);
        int loop = 0;
        do {
            System.out.println("AddressBook Menu:");
            System.out.println("1. Add new contact");
            System.out.println("2. Find contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressBooks.addContacts();
                    break;
                case 2:
                    addressBooks.findContacts();
                    break;
                case 3:
                    addressBooks.displayContacts();
                    break;
                case 4:
                    System.out.println("Thank you.");
                    break;
                default:
                    System.out.println("Please try again (1-4).");
            }
        } while (loop == 0);
    }
}

