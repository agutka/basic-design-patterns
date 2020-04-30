package shelfExample.child;

import shelfExample.MotherRequest;

abstract public class Child {

    private Child tallerChild;

    public abstract void processRequest(MotherRequest motherRequest);

    public Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }
}
