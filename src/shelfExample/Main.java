package shelfExample;

import shelfExample.child.Ania;
import shelfExample.child.Antek;
import shelfExample.child.Child;
import shelfExample.child.Tomek;

public class Main {

    public static void main(String[] args) {

        MotherRequest motherRequestHigh = new MotherRequest(Shelf.HIGH);
        MotherRequest motherRequestMedium = new MotherRequest(Shelf.MEDIUM);
        MotherRequest motherRequestLow = new MotherRequest(Shelf.LOW);

        Child ania = new Ania();
        Child tomek = new Tomek();
        Child antek = new Antek();

        ania.setTallerChild(tomek);
        tomek.setTallerChild(antek);

        ania.processRequest(motherRequestHigh);
        ania.processRequest(motherRequestMedium);
        ania.processRequest(motherRequestLow);
    }
}
