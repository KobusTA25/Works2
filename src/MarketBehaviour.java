import java.util.List;
interface MarketBehaviour<T> {
    void acceptToMarket(T person);
    void releaseFromMarket(T person);
    void update();
}