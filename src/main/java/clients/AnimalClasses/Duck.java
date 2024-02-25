package clients.AnimalClasses;
import java.time.LocalDate;

import clients.Animal;
import clients.Owner;

public class Duck extends Animal {
    public Duck(String name, float weight, LocalDate birthDate, Owner owner) {
        super(name, weight, birthDate, owner,
                true, true, true);
    }
}
