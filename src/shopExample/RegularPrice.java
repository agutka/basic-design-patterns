package shopExample;

public class RegularPrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSingedUpFromNewsletter) {
        if(!isSingedUpFromNewsletter) {
            System.out.println("Normalna cena: " + price);
        }else {
            System.out.println("Zła strategia cenowa, rabat nie będzie naliczony.");
        }
    }
}
