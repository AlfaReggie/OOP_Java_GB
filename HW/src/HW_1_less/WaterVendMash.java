package HW_1_less;

import java.util.LinkedList;

public class WaterVendMash implements VendMach {
    private LinkedList<Product> waters;
    @Override
    public void putProduct(LinkedList<Product> item) {
        this.waters = item;
    }

    @Override
    public Product getProduct() {
        return waters.pollLast();
    }

    @Override
    public int compare(Product o1, Product o2) {
        return 0;
    }

}
