package pharmacy;

import java.util.Collection;

public abstract class MedicineComponent implements Comparable<MedicineComponent> {
    private String name;
    private float weight;
    private int power;

    public MedicineComponent(String name, float weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public float getWeight() {
        return this.weight;
    }
    public int getPower() {
        return power;
    }

    @Override
    public int compareTo(MedicineComponent o) {
        if (this.power > o.power) return 1;
        else if (this.power < o.power) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "{ " + name + " вес " + weight + " эффективность " + power + " }";
    }
}
