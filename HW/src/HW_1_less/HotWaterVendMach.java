package HW_1_less;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class HotWaterVendMach implements VendMach, Iterable<Product> {
    private LinkedList<Product> hot_waters;

    @Override
    public void putProduct(LinkedList<Product> item) {
        this.hot_waters = item;
    }

    @Override
    public Product getProduct() {
        return hot_waters.element();
    }

    public ArrayList<Product> getProduct(String name, Double price, Double temperature, Double volume) {
        ArrayList<Product> need_hw = new ArrayList<>();
        for (Product hotWater: hot_waters) {
            if (((HotWater)(hotWater)).getTemperature().equals(temperature) && ((HotWater)(hotWater)).getVolume().equals(volume)
                    && hotWater.name.equals(name)) {
                need_hw.add(hotWater);
            }
        }
        return need_hw;
    }

    @Override
    public Iterator<Product> iterator() {
        return new HotWaterIterator(hot_waters);
    }

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.price > o2.price)
            return 1;
        else if (o1.price < o2.price)
            return -1;
        else
            return 0;
    }
}
