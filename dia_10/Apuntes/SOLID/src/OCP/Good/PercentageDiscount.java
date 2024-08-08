package OCP.Good;

public class PercentageDiscount extends Discount{
    private double percentage;
    
    public PercentageDiscount(double percentage){
        this.percentage=percentage;
    }
    
    @Override
    public double calculate(double amount) {
        return amount * percentage;
    }
}