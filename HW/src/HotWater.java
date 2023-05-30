public class HotWater extends Water {
    private Double temperature;
    private Double volume;

    @Override
    public String getName() {
        return this.getName();
    }


    public HotWater(String name, Double price, Double temperature, Double volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotWater{" +
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
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        super.price = price;
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
