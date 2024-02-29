package clients.patients;

import clients.Animal;
import clients.Owner;
import clients.patients.faetures.Swimmable;
import clients.patients.faetures.Goable;

import java.time.LocalDate;

public class Lion extends Animal implements Swimmable, Goable {
    public Lion(String name, float weight, LocalDate birthDate, Owner owner) {
        super(name, weight, birthDate, owner);
    }

    @Override
    public double swim() {
        System.out.println(getType() + getName() + " поплавал");
        return 6;
    }

    @Override
    public double run() {
        System.out.printf("%S%S %S\n", getType(), getName(), "пробежался");
        return 40;
    }
    @Override
    public String toString() {
        return "Lion " + super.toString();
    }
}
