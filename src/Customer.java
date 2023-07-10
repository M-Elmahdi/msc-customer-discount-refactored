public class Customer {

    private String name;
    private double totalPurchaseAmount;
    private int loyaltyPoints;
    private DiscountCalculator discountCalculator;

    public Customer(String name, double totalPurchaseAmount, int loyaltyPoints) {
        this.name = name;
        this.totalPurchaseAmount = totalPurchaseAmount;
        this.loyaltyPoints = loyaltyPoints;
        this.discountCalculator = new DiscountCalculator();
    }

    public double calculateDiscount() {
        return discountCalculator.calculateDiscount(totalPurchaseAmount, loyaltyPoints);
    }
}
