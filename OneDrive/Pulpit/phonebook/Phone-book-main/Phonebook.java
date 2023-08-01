import java.util.ArrayList;
import java.util.List;


public class Phonebook {
    private List<Contact> contacts;
    
    public Phonebook(){
        this.contacts = new ArrayList<>();
    }

    public Contact getEntry(int index){
        return new Contact(contacts.get(index));
    }

     public void setEntry(int index, Contact contact){
        this.contacts.set(index, new Contact(contact));
    }

    public void addEntry(Contact contact){
        this.contacts.add(new Contact(contact));
    }

   public String toString() {
        String temp = "";
        int i = 1;
        for (Contact contact : contacts) {
            temp += "-------- " + i + " -------- \n" + contact.toString() + "\n" ;
            i++;
        }
        return temp;
    }
}
