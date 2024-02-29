package clients.patients;
import java.time.LocalDate;

import clients.Animal;
import clients.Owner;
import clients.patients.faetures.Flyable;
import clients.patients.faetures.Goable;

public class Parrot extends Animal implements Goable, Flyable {
    public Parrot(String name, float weight, LocalDate birthDate, Owner owner) {
        super(name, weight, birthDate, owner);
    }

    @Override
    public double run() {
        System.out.printf("%s%s %s\n", getType(), getName(), "прошёлся");
        return 0.5;
    }

    @Override
    public double fly() {
        System.out.printf("%s%s %s\n", getType(), getName(), "полетал");
        return 8;
    }
    @Override
    public String toString() {
        return "Parrot " + super.toString();
    }
}
