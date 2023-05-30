/*Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре*/

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        WaterVendMash wvm = new WaterVendMash();

        Product bonAqua = new Water("bonAqua", 50.0);
        Product redKey = new Water("redKey", 60.0);
        LinkedList<Product> l = new LinkedList<>();
        l.add(bonAqua);
        l.add(redKey);

        wvm.putProduct(l);

        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());

        HotWaterVendMach hwvm = new HotWaterVendMach();

        HotWater latte = new HotWater("latte", 160.0, 70.0, 0.5);
        HotWater americano = new HotWater("americano", 165.0, 70.0, 0.5);
        HotWater cappuccino = new HotWater("cappuccino", 180.0, 75.0, 0.6);
        HotWater americano1 = new HotWater("americano", 120.0, 89.0, 0.4);
        HotWater americano3 = new HotWater("americano", 200.0, 80.0, 0.4);
        HotWater americano4 = new HotWater("americano", 115.0, 70.0, 0.5);

        LinkedList<Product> hot = new LinkedList<>();
        hot.add(latte);
        hot.add(americano);
        hot.add(cappuccino);
        hot.add(americano1);
        hot.add(americano3);
        hot.add(americano4);

        hwvm.putProduct(hot);

        System.out.println(hwvm.getProduct("americano", 120.0, 70.0, 0.5));

    }
}