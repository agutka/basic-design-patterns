package shelfExample.child;

import shelfExample.MotherRequest;
import shelfExample.Shelf;

public class Ania extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.LOW)) {
            System.out.println("Ania zdjęła słoik z półki.");
        } else {
            System.out.println("Ania nie dosięga do półki, prosi o pomoc Tomka");
            getTallerChild().processRequest(motherRequest);
        }
    }
}
