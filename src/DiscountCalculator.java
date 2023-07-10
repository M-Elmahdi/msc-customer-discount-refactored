import java.util.ArrayList;
import java.util.List;

public class DiscountCalculator {

    private List<DiscountRule> discountRules;

    public DiscountCalculator() {
        this.discountRules = new ArrayList<>();
        this.discountRules.add(new LoyaltyDiscountRule());
        this.discountRules.add(new HighPurchaseAmountDiscountRule());
        this.discountRules.add(new LowPurchaseAmountDiscountRule());
    }

    public double calculateDiscount(double totalPurchaseAmount, int loyaltyPoints) {
        for (DiscountRule rule : discountRules) {
            double discount = rule.calculateDiscount(totalPurchaseAmount, loyaltyPoints);
            if (discount > 0.0) {
                return discount;
            }
        }
        return 0.0;
    }

}
