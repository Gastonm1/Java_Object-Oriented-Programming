import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    // Generated from IntelliJ to compare objects
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    // Manual Overrides to compare objects
    //    @Override
//    public boolean equals(Object obj) {
//        if(this == obj)
//            return true;
//
//        if (!(obj instanceof Point))
//            return false;
//
//        var other = (Point) obj;
//        return other.x == x && other.y == y;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(x,y);
//    }
}
