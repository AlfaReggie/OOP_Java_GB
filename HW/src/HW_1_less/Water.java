package HW_1_less;

public class Water extends Product {
    @Override
    public String getName() {
        return name;
    }

    public Water(String name, Double price) {
        super.name = name;
        super.price = price;
    }

    @Override
    public String toString() {
        return "HW_1_less.Water{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public Double getPrice() {
        return 0.0;
    }

    @Override
    public void setPrice(Double price) {
        super.price = price;
    }
}
