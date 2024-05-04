import company.beans.*;
import company.exceptions.*;
import company.interfaces.*;
import company.implementations.*;

public class Main {
    public static void main(String[] args) {

        try {
            Person person = new Person("Will", 25);
            System.out.println("Person's name: " + person.getName());
            System.out.println("Person's age: " + person.getAge());

            EmailMessenger messenger = new EmailMessenger();
            messenger.sendMessage("Message from the EmailMessenger");

        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
