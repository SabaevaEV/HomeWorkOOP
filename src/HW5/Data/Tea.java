package HW5.Data;

public class Tea extends HotDrinks{
    protected int temperature;
    public Tea (String name, int volume, int cost, int temperature) {
        super(name, volume, cost);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Чай {" +
                "Температура =" + temperature +
                ", Напиток ='" + name + '\'' +
                ", Стоимость напитка =" + cost +
                ", Объем=" + volume +
                '}';
    }
}
