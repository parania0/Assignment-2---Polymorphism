import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Student("Amina", "Sergazina", 3));
        persons.add(new Student("Dameli", "Taubasar", 2));

        persons.add(new Employee("Yerasyl", "Unerbek", "Starosta", 10));

        Collections.sort(persons);

        printData(persons);

    }

    public static void printData(Iterable<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }

}