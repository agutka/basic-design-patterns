package shopExample;

public interface PricingStrategy {

    void calculatePrice(int price, boolean isSingedUpFromNewsletter);
}
