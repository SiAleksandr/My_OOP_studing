import pharmacy.Medicine;
import pharmacy.MedicineComponent;
import pharmacy.impl.Asitromin;
import pharmacy.impl.Moxidectin;
import pharmacy.impl.Penicilinium;
import pharmacy.impl.Vetbicid;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void sortMedicines(ArrayList<Medicine> med) {
        Collections.sort(med);
        int pos = 1;
        for (Medicine item : med) {
            System.out.printf("Лекарство %d компоненты\n", pos);
            for (MedicineComponent c : item) {
                System.out.println(c);
            }
            pos++;
        }
    }

    public static void main(String[] args) {

        Asitromin asitr1 = new Asitromin("Аситромин", 3, 4);
        Penicilinium penicilinium1 = new Penicilinium("Пенициллин", 3, 8);
        Vetbicid vetbicid1 = new Vetbicid("Ветбицид", 2, 7);
        Moxidectin moxidectin = new Moxidectin("Моксидектин", 5, 3);
        Medicine medicine1 = new Medicine();
        medicine1.addComponent(asitr1).addComponent
                (penicilinium1).addComponent(vetbicid1).addComponent(moxidectin);

        Asitromin asitr2 = new Asitromin("Аситромин", 3, 4);
        Penicilinium penicilinium2 = new Penicilinium("Пенициллин", 5, 8);
        Vetbicid vetbicid2 = new Vetbicid("Ветбицид", 2, 7);
        Medicine medicine2 = new Medicine();
        medicine2.addComponent(asitr2).addComponent(penicilinium2).addComponent(vetbicid2);

        Asitromin asitr3 = new Asitromin("Аситромин", 2, 4);
        Penicilinium penicilinium3 = new Penicilinium("Пенициллин", 1, 8);
        Vetbicid vetbicid3 = new Vetbicid("Ветбицид", 4, 7);
        Medicine medicine3 = new Medicine();
        medicine3.addComponent(asitr3).addComponent(penicilinium3).addComponent(vetbicid3);

        ArrayList<Medicine> controlList = new ArrayList<>();
        controlList.add(medicine1);
        controlList.add(medicine2);
        controlList.add(medicine3);
        sortMedicines(controlList);
//

//        List<MedicineComponent> medList = new ArrayList<>();
//        medList.add(asitr1);
//        medList.add(penicilinium1);
//        medList.add(vetbicid1);
//        Collections.sort(medList, Comparator.reverseOrder());
//        Collections.sort(medList, (comp1, comp2) -> (int)(comp1.getWeight() - comp2.getWeight()));
//        for(MedicineComponent c: medList) System.out.println(c);


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