import clients.Animal;
import clients.patients.*;
import clients.Owner;
import pharmacy.Medicine;
import pharmacy.MedicineComponent;
import pharmacy.impl.Asitromin;
import pharmacy.impl.Penicilinium;
import pharmacy.impl.Vetbicid;
import work.VeterinaryClinic;
import work.staff.*;

import java.time.LocalDate;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Asitromin asitr1 = new Asitromin("Аситромин", 0.006f, 16);
        Penicilinium penicilinium1 = new Penicilinium("Пенициллин", 0.012f, 19);
        Vetbicid vetbicid1 = new Vetbicid("Ветбицид", 0.9f, 25);
        Medicine medicine1 = new Medicine();
        medicine1.addComponent(asitr1).addComponent(penicilinium1).addComponent(vetbicid1);
        Iterator<MedicineComponent> med = medicine1;
        while (medicine1.hasNext()) System.out.println(med.next());
        System.out.println(medicine1);

/*        Lion lion1 = new Lion("Лёва", 45, LocalDate.of
                (2007, 2, 3), new Owner());
        Dog dog1 = new Dog("Лорд", 12,
                LocalDate.of(2022, 2, 13), new Owner());
        Carp carp1 = new Carp("Свежий", 2,
                LocalDate.of(2023, 9, 1), new Owner());
        Goldfish goldfish1 = new Goldfish("Дорогуша", 0.05f,
                LocalDate.of(2024, 1, 7), new Owner());
        Duck duck1 = new Duck("Перелётная", 3.5f,
                LocalDate.of(2023, 7, 7), new Owner());
        Parrot parrot1 = new Parrot("Пернатый", 0.25f,
                LocalDate.of(2022, 4, 1), new Owner());

        Doctor dr1 = new Doctor("Николай", "Николаев");
        Doctor dr2 = new Doctor("Борис", "Борисов");
        Doctor dr3 = new Doctor("Иван", "Ивановский");
        Doctor dr4 = new Doctor("Поликарп", "Прокофьев");
        Doctor dr5 = new Doctor("Степан", "Светлаков");

        Nurse nr1 = new Nurse("Светлана", "Васильева");
        Nurse nr2 = new Nurse("Елена", "Еланина");
        Nurse nr3 = new Nurse("Оксана", "Аксакова");

        VeterinaryClinic vc = new VeterinaryClinic();

        vc.hireDoctor(dr1);
        vc.hireDoctor(dr2);
        vc.hireDoctor(dr3);
        vc.hireDoctor(dr4);
        vc.hireDoctor(dr5);

        vc.hireNurse(nr1);
        vc.hireNurse(nr2);
        vc.hireNurse(nr3);

        vc.takeAnimal(lion1);
        vc.takeAnimal(dog1);
        vc.takeAnimal(carp1);
        vc.takeAnimal(goldfish1);
        vc.takeAnimal(duck1);
        vc.takeAnimal(parrot1);*/
    }
}