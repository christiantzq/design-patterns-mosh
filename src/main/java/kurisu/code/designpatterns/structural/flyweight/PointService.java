package kurisu.code.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory factory;

    
    public PointService(PointIconFactory factory) {
        this.factory = factory;
    }


    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        Point p1 = new Point(1, 2, factory.getPointIcon(PointType.CAFFE));
        points.add(p1);
        // ...

        return points;
    }
    
}
