package shopExample;

public class Main {

    public static void main(String[] args) {

        PriceCalculator priceCalculator = new PriceCalculator();

        //normalna cena.
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100,false);

        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100,true);

        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, true);

        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, false);
    }
}
