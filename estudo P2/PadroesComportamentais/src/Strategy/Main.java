package Strategy;

public class Main {
    public static void main(String[] args) {
        Strategy strategyA = new StrategyA();
        Strategy strategyB = new StrategyB();
        Strategy strategyC = new StrategyC();

        Context context = new Context();

        context.setStrategy(strategyA);
        context.executeStrategy();
    }
}
