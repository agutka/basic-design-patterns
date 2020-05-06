package transportExample.visitor;

import transportExample.Animal;
import transportExample.Person;
import transportExample.Shipment;

public interface TransportVisitor {

    void visit (Animal animal);
    void visit (Person person);
    void visit (Shipment shipment);
}
