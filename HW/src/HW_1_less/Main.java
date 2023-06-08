package HW_1_less;/*Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре*/

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        WaterVendMash wvm = new WaterVendMash();

        Product bonAqua = new Water("bonAqua", 50L);
        Product redKey = new Water("redKey", 60L);
        LinkedList<Product> l = new LinkedList<>();
        l.add(bonAqua);
        l.add(redKey);

        wvm.putProduct(l);

        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());

        HotWaterVendMach hwvm = new HotWaterVendMach();

        HotWater latte = new HotWater("latte", 160L, 70.0, 0.5);
        HotWater americano = new HotWater("americano", 165L, 70.0, 0.5);
        HotWater cappuccino = new HotWater("cappuccino", 180L, 75.0, 0.6);
        HotWater americano1 = new HotWater("americano", 120L, 89.0, 0.4);
        HotWater americano3 = new HotWater("americano", 200L, 80.0, 0.4);
        HotWater americano4 = new HotWater("americano", 115L, 70.0, 0.5);

        LinkedList<Product> hot = new LinkedList<>();
        hot.add(latte);
        hot.add(americano);
        hot.add(cappuccino);
        hot.add(americano1);
        hot.add(americano3);
        hot.add(americano4);

        hwvm.putProduct(hot);

        System.out.println(hwvm.getProduct("americano", 120L, 70.0, 0.5));

        System.out.println("____________________");

        //hot.sort(Comparator.comparingDouble(o -> o.price));

        hot.sort(Comparator.naturalOrder());

        Iterator<Product> iterator = hwvm.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}