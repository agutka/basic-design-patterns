package shelfExample.child;

import shelfExample.MotherRequest;
import shelfExample.Shelf;

public class Antek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Antek zdjęł słoik z półki.");
        } else {
            System.out.println("Jak Antek nie dosięgnie, to bez drabiny się nie obejdzie!");
        }
    }
}
