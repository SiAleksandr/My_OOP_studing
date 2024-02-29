package work;

import clients.patients.Goldfish;
import clients.patients.faetures.Flyable;
import clients.patients.faetures.Goable;
import clients.patients.faetures.Swimmable;
import work.staff.*;
import clients.Animal;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.ArrayList;

public class VeterinaryClinic {
    private static List<Doctor> doctors = new ArrayList<>();
    private static List<Nurse> nurses = new ArrayList<>();
    private static List<Animal> sickAnimals = new ArrayList<>();
    private static Deque<Integer> sickFree = new ArrayDeque<>();

    public void takeAnimal(Animal animal) {
        if (sickFree.size() > 0) {
            animal.setOwnID(sickFree.getLast());
            sickFree.removeLast();
            sickAnimals.set(animal.getOwnID(), animal);
        } else {
            animal.setOwnID(sickAnimals.size());
            sickAnimals.add(animal);
        }
        animal.onTreatment = true;
    }

    public void stopControlling(Animal animal) {
        sickFree.addLast(animal.getOwnID());
        animal.onTreatment = false;
    }

    public void printSickAnimals() {
        for (Animal item : sickAnimals)
            if (item.onTreatment == true) System.out.println(item);
    }
    public void printGoable() {
        for (Animal item: sickAnimals)
            if (item instanceof Goable) System.out.println(item);
    }
    public void printSwimmable() {
        for (Animal item: sickAnimals)
            if (item instanceof Swimmable) System.out.println(item);
    }
    public void printFlyable() {
        for (Animal item: sickAnimals)
            if (item instanceof Flyable) System.out.println(item);
    }


    public void hireDoctor(Doctor doctor) {
        doctor.setID(doctors.size());
        doctors.add(doctor);
        doctor.hired = true;
    }

    public void hireNurse(Nurse nurse) {
        nurse.setID(nurses.size());
        nurses.add(nurse);
        nurse.hired = true;
    }

    public void fireOutDoctor(Integer ownID) {
        for (int i = 0; i < doctors.size(); i++) {
            if (i == ownID) doctors.get(i).hired = false;
        }
    }

    public void fireOutNurse(Integer ownID) {
        for (int i = 0; i < nurses.size(); i++) {
            if (i == ownID) nurses.get(i).hired = false;
        }
    }

    public void printDoctorsList() {
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).hired == true)
                System.out.println(doctors.get(i));
        }
    }

    public void printNursesList() {
        for (int i = 0; i < nurses.size(); i++) {
            if (nurses.get(i).hired == true)
                System.out.println(nurses.get(i));
        }
    }
}
