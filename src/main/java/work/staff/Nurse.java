package work.staff;

import work.Medic;

public class Nurse extends Medic {

    public Nurse(String name, String surname) {
        super(name, surname);
    }
    public String toString() {
        return "Медсестра " + name + " " + surname + " ID " + ownID;
    }
}
