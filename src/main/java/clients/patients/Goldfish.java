package clients.patients;
import java.time.LocalDate;

import clients.Animal;
import clients.Owner;
import clients.patients.faetures.Swimmable;

public class Goldfish extends Animal implements Swimmable {
    public Goldfish(String name, float weight, LocalDate birthDate, Owner owner) {
        super(name, weight, birthDate, owner);
    }

    @Override
    public double swim() {
        System.out.println(getType() + getName() + " поплавала");
        return 1.5;
    }
    @Override
    public String toString() {
        return "Goldfish " + super.toString();
    }
}
