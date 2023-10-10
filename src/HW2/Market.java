package HW2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour,MarketBehaviour {
    List <Actor> que = new ArrayList<>();
    Queue <Actor> orders = new LinkedList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        que.add(actor);
        System.out.println(actor.getName() + " зашел в магазин");
    }

    @Override
    public void takeInQueue(Actor actor) {
        orders.add(actor);
        System.out.println(actor.getName() + " встал в очередь");

    }

    @Override
    public void takeOrders() {
        orders.peek().isTakeOrder();
        System.out.println(orders.peek().getName() + " заказ принят");
    }

    @Override
    public void giveOrders() {

       orders.peek().isMakeOrder();
       System.out.println(orders.peek().getName() + " заказ выполнен");
    }

    @Override
    public void releaseFromQueue(Actor actor) {
        que.remove(actor);
        System.out.println(actor.getName() + " вышел из очереди");
    }
    @Override
    public void releaseFromMarket(Actor actor) {
        System.out.println(actor.getName() + " вышел из магазина");
    }

    @Override
    public void update(Actor actor) {
    acceptToMarket(actor);
    takeInQueue(actor);
    takeOrders();
    giveOrders();
    releaseFromQueue(actor);
    releaseFromMarket(actor);
    }
}
