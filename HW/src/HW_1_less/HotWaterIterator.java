package HW_1_less;

import java.util.Iterator;
import java.util.LinkedList;

public class HotWaterIterator implements Iterator<Product> {
    private int counter;
    private final LinkedList<Product> hot_water;

    public HotWaterIterator(LinkedList<Product> hotWater) {
        this.counter = 0;
        hot_water = hotWater;
    }

    @Override
    public boolean hasNext() {
        return counter < hot_water.size();
    }

    @Override
    public Product next() {
        if (!hasNext()){
            throw new RuntimeException("HW_1_less.Product");
        }

        return hot_water.get(counter++);
    }
}
