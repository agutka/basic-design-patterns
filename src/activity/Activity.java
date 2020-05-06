package activity;

import visitor.Visitor;

public interface Activity {

    void accept(Visitor visitor);
}
