package clients.patients;

import clients.Animal;
import clients.Owner;
import clients.patients.faetures.Swimmable;
import clients.patients.faetures.Goable;

import java.time.LocalDate;

public class Dog extends Animal implements Swimmable, Goable {
    public Dog(String name, float weight, LocalDate birthDate, Owner owner) {
        super(name, weight, birthDate, owner);
    }

    @Override
    public double swim() {
        System.out.println(getType() + getName() + " поплавал");
        return 4.5;
    }

    @Override
    public double run() {
        System.out.printf("%s%s %s\n", getType(), getName(), "побегал");
        return 25;
    }
    @Override
    public String toString() {
        return "Dog " + super.toString();
    }
}
