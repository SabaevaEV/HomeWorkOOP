package HW2;

public class Main {
    public static void main(String[] args) {
        Human name = new Human();
        Market market = new Market();

        name.setName("Alexsandr");
        market.update(name);

        name.setName("Vika");
        market.update(name);
    }
}
