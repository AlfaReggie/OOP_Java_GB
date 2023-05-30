import java.util.ArrayList;
import java.util.LinkedList;

public class HotWaterVendMach implements VendMach {
    private LinkedList<Product> hot_waters;

    @Override
    public void putProduct(LinkedList<Product> item) {
        this.hot_waters = item;
    }

    @Override
    public Product getProduct() {
        return null;
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
}
