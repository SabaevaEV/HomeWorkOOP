package HW5.Data;

public abstract class HotDrinks {
    protected   String name;
    protected int cost;
    protected int volume;

    public HotDrinks(String name, int volume, int cost) {
        this.name = name;
        this.volume = volume;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrinks{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", volume=" + volume +
                '}';
    }
}
