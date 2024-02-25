import clients.Animal;
import clients.AnimalClasses.*;
import clients.Owner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion("Лёва", 45, LocalDate.of
                (2007, 2, 3), new Owner());
        Lion lion2 = new Lion("Король", 40, LocalDate.of
                (2005, 3, 10), new Owner());
        System.out.println(lion1);
        System.out.println(lion2);
        System.out.println(lion1.getType());
        lion1.lifeCycle();
        System.out.println();

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

        List<Animal> animals = new ArrayList<>();
        animals.add(lion2);
        animals.add(dog1);
        animals.add(carp1);
        animals.add(goldfish1);
        animals.add(duck1);
        animals.add(parrot1);
        for(Animal item: animals){
            System.out.println(item);
            item.toGo();
            item.swim();
            item.fly();
            System.out.println();
        }
    }
}