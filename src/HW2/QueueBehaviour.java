package HW2;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    //void takeOrders();

    void takeOrders();

    void giveOrders();
    void releaseFromQueue(Actor actor);
}
