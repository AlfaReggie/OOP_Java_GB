package HW_1_less;

import java.util.LinkedList;
public interface VendMach {
    public void putProduct(LinkedList<Product> item);

    public Product getProduct();

    int compare(Product o1, Product o2);
}
