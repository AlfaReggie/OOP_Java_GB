package HW_1_less;

public class Water extends Product {
    @Override
    public String getName() {
        return name;
    }

    public Water(String name, Long price) {
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
    public long getPrice() {
        return 0L;
    }

    @Override
    public void setPrice(Long price) {
        super.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }

}
