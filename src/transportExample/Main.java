package transportExample;

import transportExample.visitor.NameTransportVisitor;
import transportExample.visitor.PriceTransportVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Dog", 30);
        Person person = new Person("Adam", "Nowak", true);
        Shipment shipment = new Shipment("PL", "21a13", false);

        List<Transportable> transportableList = Arrays.asList(animal,person,shipment);

        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        transportableList.forEach(transportable -> transportable.accept(nameTransportVisitor));
        System.out.println(" -------------------------- ");
        transportableList.forEach(transportable -> transportable.accept(priceTransportVisitor));
    }
}
