import java.util.List;



public class Main {
    public static void main(String[] args) {
        Market<String> market = new Market<>();

        market.acceptToMarket("Дима");
        market.acceptToMarket("Вера");

        market.releaseFromMarket("Иван");

        market.update();
    }
}