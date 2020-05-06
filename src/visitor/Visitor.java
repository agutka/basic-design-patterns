package visitor;

import activity.Squash;
import activity.Treadmill;
import activity.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);
}
