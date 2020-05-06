package shopExample;

public class PriceCalculator {

    private PricingStrategy pricingStrategy;

    public void calculate(int price, boolean isSingedUpFromNewsletter) {
        this.pricingStrategy.calculatePrice(price,isSingedUpFromNewsletter);
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}
