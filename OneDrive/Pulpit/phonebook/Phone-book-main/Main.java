import java.util.Scanner;

public class Main{

    static Phonebook phonebook = new Phonebook();
    public static void main(String[] args) {

    Contact[] contacts = new Contact[] {
            new Contact("James", "12344455"),
            new Contact("Carl", "555555555"),
            new Contact("Sophie", "3333333333"),
        };

        for (Contact contact : contacts) {
            phonebook.addEntry(contact);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("----------PHONE BOOK---------");
        System.out.println("1. Open the book");
        System.out.println("2. Close the book");
        int choice = input.nextInt();

        while(choice==1){
        System.out.println("What do you want to do: ");
        System.out.println("1. Add new contact.");
        System.out.println("2. See all contacts.");
        System.out.println("3. Edit.");
        System.out.println("4. Delete.");
        System.out.println("5. Exit.");
        int answer = input.nextInt();
           switch(answer) {
                case 1:
                    System.out.println("Type name: ");
                    String nameAdd = input.nextLine();
                    input.nextLine();
                    System.out.println("Type phone number: ");
                    String phoneAdd = input.nextLine();
                    
                    System.out.println("----->Added a new contact into");
                    System.out.println("-----------------");
                    break;
                case 2:
                    System.out.println("All contacts in your phone book: ");
                    System.out.println(phonebook);
                    break;
                case 3:
                    System.out.println("Type index of the entry: ");
                    int idx = input.nextInt();
                    Contact contact = phonebook.getEntry(idx);
                    System.out.println("Set a new phone number for " + contact.getName() + ": ");
                    String updatedNumber = input.nextLine();
                    contact.setNumber(updatedNumber);
                    break;
                case 4:
                    break;
                 case 5:
                    break;
                 }
                    
           } 
             input.close(); 
        }

   
 }