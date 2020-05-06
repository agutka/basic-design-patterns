import chef.Chef;
import chef.egg_cooker.HardBoiledEggCooker;
import chef.egg_cooker.SoftBoiledEggCooker;

public class Main {

    public static void main(String[] args) {

        Chef chef = new Chef("Magda Gessler");

        //Nowe zamowienie - jajka na twardo.
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();

        //Nowe zamowienie - jajka na miekko.
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();

    }
}
