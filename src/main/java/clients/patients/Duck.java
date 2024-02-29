package clients.patients;

import java.time.LocalDate;

import clients.Animal;
import clients.Owner;
import clients.patients.faetures.Swimmable;
import clients.patients.faetures.Flyable;
import clients.patients.faetures.Goable;

public class Duck extends Animal implements Goable, Swimmable, Flyable {
    public Duck(String name, float weight, LocalDate birthDate, Owner owner) {
        super(name, weight, birthDate, owner);
    }

    @Override
    public double swim() {
        System.out.println(getType() + getName() + " поплавала");
        return 5;
    }

    @Override
    public double run() {
        System.out.printf("%s%s %s\n", getType(), getName(), "прошлась");
        return 1;
    }

    @Override
    public double fly() {
        System.out.printf("%s%s %s\n", getType(), getName(), "полетала");
        return 45;
    }

    @Override
    public String toString() {
        return "Duck " + super.toString();
    }
}
