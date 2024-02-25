package clients;

import java.time.LocalDate;

public class Animal {
    protected String name;
    protected float weight;
    protected LocalDate birthDate;
    protected Owner owner;
    public boolean isGoing;
    protected boolean isSwimming;
    protected boolean isFlying;

    public Animal(String name, float weight, LocalDate age, Owner owner,
                  boolean isGoing, boolean isSwimming, boolean isFlying) {
        this.name = name;
        this.weight = weight;
        this.birthDate = age;
        this.owner = owner;
        this.isGoing = isGoing;
        this.isSwimming = isSwimming;
        this.isFlying = isFlying;
    }

    public void toGo() {
        if(isGoing == true)
            System.out.println(getType() + name + " is walking");
    }
    public void swim() {
        if(isSwimming == true)
            System.out.println(getType() + name + " is swimming");
    }
    public void fly() {
        if(isFlying == true)
            System.out.println(getType() + name + " is flying");
    }

    public void lifeCycle() {
        wakeup(15.35);
        eat();
        play();
        sleep();
    }

    private void sleep() {
        System.out.println(getType() + name + " is sleeping");
    }

    private void wakeup() {
        System.out.println(getType() + name + " waked up");
    }

    private void wakeup(double time) {
        System.out.println(getType() + name + " waked up at " + time);
    }

    private void eat() {
        System.out.println(getType() + name + " is eating");
    }

    private void play() {
        System.out.println(getType() + name + " is playing");
    }

    public String getType() {

        return getClass().getSimpleName() + " ";
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String toString() {

        return String.format("name = %s, weight = %s, date of birth = %s, owner = %s",
                name, weight, birthDate, owner);
    }
}
