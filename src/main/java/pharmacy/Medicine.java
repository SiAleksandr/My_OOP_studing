package pharmacy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine implements Iterator {
    private List<MedicineComponent> components;
    private int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }
    public Medicine addComponent (MedicineComponent component) {
        components.add(component);
        return this;
    }

    @Override
    public boolean hasNext() {
        if (index == components.size()) {
            index = 0;
            return false;
        }
        else return index < components.size();
    }

    @Override
    public MedicineComponent next() {

        return components.get(index++);
    }
    @Override
    public String toString() {
        return "Лекарство, состав: \n" + components.toString();
    }
}
