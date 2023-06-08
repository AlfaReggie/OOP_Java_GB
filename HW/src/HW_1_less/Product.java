package HW_1_less;

public abstract class Product implements Comparable<Product>{


    // Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
    // содержащий
    // в себе методы initProducts (List <HW_1_less.Product>) сохраняющий в себе список
    // исходных продуктов и
    // getProduct(String name)

    protected String name;
    protected Long price;


    public abstract String getName();

    public abstract void setName(String name);

    public abstract long getPrice();

    public abstract void setPrice(Long price);
}