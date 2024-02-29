package clients.patients;

import java.time.LocalDate;

import clients.Animal;
import clients.Owner;
import clients.patients.faetures.Swimmable;

public class Carp extends Animal implements Swimmable {
    public Carp(String name, float weight, LocalDate birthDate, Owner owner) {
        super(name, weight, birthDate, owner);
    }

    @Override
    public double swim() {
        System.out.println(getType() + getName() + " поплавал");
        return 9;
    }

    @Override
    public String toString() {
        return "Carp " + super.toString();
    }
}
