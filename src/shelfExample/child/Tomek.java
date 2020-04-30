package shelfExample.child;

import shelfExample.MotherRequest;
import shelfExample.Shelf;

public class Tomek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Tomek zdjęł słoik z półki.");
        } else {
            System.out.println("Tomek nie dosięga do półki, poprosi o pomoc Antka.");
            getTallerChild().processRequest(motherRequest);
        }
    }
}
