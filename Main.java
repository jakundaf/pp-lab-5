import company.beans.*;
import company.exceptions.*;
import company.interfaces.*;
import company.implementations.*;
import company.utils.*;


public class Main {
    public static void main(String[] args) {

        try {
            Person person = new Person("Will", 25);
            System.out.println("Person's name: " + person.getName());
            System.out.println("Person's age: " + person.getAge());

            int resultOfAdd = MathUtils.add(5, 6);
            System.out.println("Result of add method: " + resultOfAdd);

            EmailMessenger messenger = new EmailMessenger();
            messenger.sendMessage("Result of add method: " + resultOfAdd);

        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
