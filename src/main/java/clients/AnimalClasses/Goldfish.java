package clients.AnimalClasses;
import java.time.LocalDate;

import clients.Animal;
import clients.Owner;

public class Goldfish extends Animal{
    public Goldfish(String name, float weight, LocalDate birthDate, Owner owner) {
        super(name, weight, birthDate, owner,
                false, true, false);
    }
}
