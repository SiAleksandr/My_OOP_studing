package work;

public abstract class Medic {
    protected Integer ownID;
    protected String name;
    protected String surname;
    protected boolean hired;

    public Medic(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name + " " + surname;
    }
    public Integer getID() { return ownID; }
    public void setID(Integer nextID) { this.ownID = nextID; }
}
