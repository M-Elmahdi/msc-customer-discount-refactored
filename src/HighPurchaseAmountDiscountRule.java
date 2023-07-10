public class HighPurchaseAmountDiscountRule implements DiscountRule {

    public double calculateDiscount(double totalPurchaseAmount, int loyaltyPoints) {
        return totalPurchaseAmount * 0.05;
    }
}
