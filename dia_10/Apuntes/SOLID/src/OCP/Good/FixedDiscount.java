package OCP.Good;

public class FixedDiscount extends Discount {
    @Override
    public double calculate(double amount) {
        return amount*0.1;
    }
}
