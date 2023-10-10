package HW2;

public class Human extends Actor {


    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;

    }

    @Override
    public String toString() {
        return String.format("zakaz prinat - " + isMakeOrder + "\nzakaz vidan - " + isTakeOrder);
    }
}
