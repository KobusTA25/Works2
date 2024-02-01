import java.util.List;
interface QueueBehaviour<T> {
    void takeQueue(T actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();

    void enqueue(T element);
    T dequeue();
    int size();

    void acceptOrder(T order);

    T fulfillOrder();

    void releaseFromMarket(List<T> actorList);
}