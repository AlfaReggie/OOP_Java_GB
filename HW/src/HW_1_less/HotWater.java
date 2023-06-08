package HW_1_less;

public class HotWater extends Water{
    private Double temperature;
    private Double volume;

    @Override
    public String getName() {
        return this.getName();
    }


    public HotWater(String name, Long price, Double temperature, Double volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HW_1_less.HotWater{" +
                "name=" + name + '\'' +
                ", price=" + price + '\'' +
                ", temperature=" + temperature +
                ", volume=" + volume +'}';
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public long getPrice() {
        return price;
    }

    @Override
    public void setPrice(Long price) {
        super.price = price;
    }

    @Override
    public int compareTo(Product o) {
        if (this.price > o.price)
            return 1;
        else if (this.price < o.price)
            return -1;
        else
            return 0;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

}
