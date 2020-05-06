package shopExample;

public class SalePrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSingedUpFromNewsletter) {
        if(isSingedUpFromNewsletter) {
            System.out.println("Cena promocyjna: " + price/2);
        }
        else System.out.println("Dla niezarejestrowanych uzytkowników normalna cena: " + price);
    }
}
