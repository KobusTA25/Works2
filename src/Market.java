import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Market<T> implements QueueBehaviour<T>, MarketBehaviour<T> {
    private Queue<T> queue;

    public Market() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void takeQueue(T actor) {

    }

    @Override
    public void takeOrders() {

    }

    @Override
    public void giveOrders() {

    }

    @Override
    public void releaseFromQueue() {

    }

    @Override
    public void enqueue(T element) {
        queue.add(element);
    }

    @Override
    public T dequeue() {
        return queue.poll();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void acceptOrder(T order) {

    }

    @Override
    public T fulfillOrder() {
        return null;
    }

    @Override
    public void acceptToMarket(T person) {
        enqueue(person);
        System.out.println("Человек " + person + " заказ принят.");
    }

    @Override
    public void releaseFromMarket(List<T> actorList) {

    }

    @Override
    public void releaseFromMarket(T person) {
        if (queue.contains(person)) {
            queue.remove(person);
            System.out.println("Человек " + person + " заказ выдан.");
        } else {
            System.out.println("Человек " + person + " нет заказа.");
        }
    }

    @Override
    public void update() {
        // Логика обновления состояния магазина
        System.out.println("Обновлено состояние рынка.");
    }
}