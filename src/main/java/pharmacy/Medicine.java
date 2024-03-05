package pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine implements Iterable<MedicineComponent>, Comparable<Medicine> {

    private List<MedicineComponent> components;
    private int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }

    @Override
    public int compareTo(Medicine o) {
        float sumWeight = 0;
        int sumPower = 0;
        for (MedicineComponent item : this.components) {
            sumWeight += item.getWeight();
            sumPower += item.getPower();
        }
        float sumWeightO = 0;
        int sumPowerO = 0;
        for (MedicineComponent item : o.components) {
            sumWeightO += item.getWeight();
            sumPowerO += item.getPower();
        }
        int res;
        if (sumPower > sumPowerO) res = 1;
        else if (sumPower < sumPowerO) res = -1;
        else if (sumWeight > sumWeightO) res = 1;
        else if (sumWeight < sumWeightO) res = -1;
        else if (this.components.size() > o.components.size()) res = 1;
        else if (this.components.size() < o.components.size()) res = -1;
        else res = 0;
        return res;
    }

    @Override
    public Iterator<MedicineComponent> iterator() {
        return new Iterator<MedicineComponent>() {
            @Override
            public boolean hasNext() {
                if (index == components.size()) {
                    index = 0;
                    return false;
                } else return index < components.size();
            }

            @Override
            public MedicineComponent next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        return "Лекарство, состав: \n" + components.toString();
    }
}

