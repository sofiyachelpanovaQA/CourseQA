package practice_6.cost_counter;

public class Main {
    public static void main(String[] args) {
        CostCounter costCounter = new CostCounter();
        costCounter.addCosts(1, 146456.111);
        costCounter.addCosts(2, 146.111);
        costCounter.addCosts(3, 14656.111);

        System.out.println(costCounter.getCosts(3));
        System.out.println(costCounter.minCostsPerMonth());
    }
}
