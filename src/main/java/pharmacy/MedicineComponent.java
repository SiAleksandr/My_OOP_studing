package pharmacy;

public abstract class  MedicineComponent {
    private String name;
    private float weight;
    private int power;

    public MedicineComponent(String name, float weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }
    @Override
    public String toString() {
        return "Компонент лекарства { " + name + " вес " + weight + " эффективность " + power + " }";
    }
}
