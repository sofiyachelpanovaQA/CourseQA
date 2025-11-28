package practice_6.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    private ArrayList<Double> costsPerMonth;

    public CostCounter() {
        this.costsPerMonth = new ArrayList<>();
    }

    public void addCosts(int month, Double costs) {
        costsPerMonth.add(month-1, costs);
    }

    public Double getCosts(int month) {
        return costsPerMonth.get(month-1);
    }

    public double minCostsPerMonth() {
        AtomicReference<Double> min = new AtomicReference<>(costsPerMonth.getFirst());
        costsPerMonth.forEach(
                costsPerMonth -> {
                    if (costsPerMonth < min.get()) {
                        min.set(costsPerMonth);
                    }
                }
        );
        return min.get();
    }
}
