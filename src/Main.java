import activity.Activity;
import activity.Squash;
import activity.Treadmill;
import activity.Weights;
import visitor.Visitor;
import visitor.VisitorImp;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);

        VisitorImp  visitor = new VisitorImp();

        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);

        System.out.println("--------------------");

        List<Activity> activityList = Arrays.asList(treadmill,squash,weights);

        activityList.forEach(activity -> activity.accept(visitor));
    }
}
