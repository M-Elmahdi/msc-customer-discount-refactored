public class LowPurchaseAmountDiscountRule implements DiscountRule {

    public double calculateDiscount(double totalPurchaseAmount, int loyaltyPoints) {
        return 0.0;
    }
}
