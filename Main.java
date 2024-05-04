import company.beans.*;
import company.exceptions.*;
import company.interfaces.*;
import company.implementations.*;
import company.utils.*;


public class Main {
    public static void main(String[] args) {

        try {
            EmailMessenger messenger = new EmailMessenger();
            Person[] people = new Person[5];
            final int b = 10;

            for (int i = 0; i < people.length; i++){
                switch(i){
                    case 0 -> people[i] = new Person("Will", 25);
                    case 1 -> people[i] = new Person ("Tomas", 84);
                    case 2 -> people[i] = new Person ("Damian", 23);
                    case 3 -> people[i] = new Person ("Karen", 18);
                    case 4 -> people[i] = new Person ("Staszek", 55);
                }
            }

            for (Person ppl : people){
                int value = MathUtils.add(ppl.getAge(), b);
                String message = "The value of adding age and b: " + value;
                messenger.sendMessage(ppl.getName() + ": " + message);
            }


        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
