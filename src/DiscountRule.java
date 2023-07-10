public interface DiscountRule {
    double calculateDiscount(double totalPurchaseAmount, int loyaltyPoints);
}
