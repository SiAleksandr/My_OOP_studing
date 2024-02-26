package clients.AnimalClasses;
import java.time.LocalDate;

import clients.Animal;
import clients.Owner;
public class Parrot extends Animal{
    public Parrot(String name, float weight, LocalDate birthDate, Owner owner) {
        super(name, weight, birthDate, owner,
                true, false, true);
    }
}