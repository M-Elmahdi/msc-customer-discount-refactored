public class LoyaltyDiscountRule implements DiscountRule{
    @Override
    public double calculateDiscount(double totalPurchaseAmount, int loyaltyPoints) {
        if (loyaltyPoints > 100) {
            return totalPurchaseAmount * 0.2;
        } else {
            return totalPurchaseAmount * 0.1;
        }
    }
}
