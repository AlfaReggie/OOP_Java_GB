package HW_1_less;

public abstract class Product implements Comparable{


    // Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
    // содержащий
    // в себе методы initProducts (List <HW_1_less.Product>) сохраняющий в себе список
    // исходных продуктов и
    // getProduct(String name)

    protected String name;
    protected Double price;


    public abstract String getName();

    public abstract void setName(String name);

    public abstract Double getPrice();

    public abstract void setPrice(Double price);

    @Override
    public abstract int compareTo(Object o);

}