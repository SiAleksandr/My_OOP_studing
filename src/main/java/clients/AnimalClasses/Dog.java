package clients.AnimalClasses;

import clients.Animal;
import clients.Owner;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String name, float weight, LocalDate birthDate, Owner owner) {
        super(name, weight, birthDate, owner,
                true, true, false);
    }
}
