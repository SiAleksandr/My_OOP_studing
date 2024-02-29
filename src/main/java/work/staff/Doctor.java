package work.staff;

import clients.Animal;
import work.Medic;

public class Doctor extends Medic {

    public Doctor(String name, String surname) {
        super(name, surname);
    }
    public void heal (Animal animal, Nurse nurse) {
        System.out.printf("%s занялся лечением,\n" +
                "у него на пиёме %s\n", this.toString(), animal.toString());
        instruct(nurse);
        System.out.printf("%s%s получил(а) помощь.\n", animal.getType(), animal.getName());
    }
    private void instruct (Nurse nurse) {
        System.out.printf("%s получила задание\n", nurse.toString());
    }
    public String toString() {
        return "Врач "  + name + " " + surname + " ID " + ownID;
    }
}
