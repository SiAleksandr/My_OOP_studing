package clients.AnimalClasses;
import java.time.LocalDate;

import clients.Animal;
import clients.Owner;

public class Carp extends Animal {
    public Carp(String name, float weight, LocalDate birthDate, Owner owner) {
        super(name, weight, birthDate, owner,
                false, true, false);
    }
}
