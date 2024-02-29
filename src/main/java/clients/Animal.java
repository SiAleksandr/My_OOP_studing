package clients;

import java.time.LocalDate;

public class Animal {
    protected String name;
    protected float weight;
    protected LocalDate birthDate;
    protected Owner owner;
    protected Integer ownID;
    public boolean onTreatment;
    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.birthDate = age;
        this.owner = owner;
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
    public void setOwnID(Integer ownID) {
        this.ownID = ownID;
    }
    public Integer getOwnID() { return ownID; }

    public String toString() {
        return String.format("имя = %s, вес = %s, дата рождения = %s, хозяин = %s, ID %d",
                name, weight, birthDate, owner, ownID);
    }
}
