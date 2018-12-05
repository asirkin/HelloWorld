//This class is a template to represent a point on the cartesian coordinate plane
package Ch8Classes;

public class PointV1 {
    //state fields below
    private int x;
    private int y;

    //behaviors below (methods)
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public double distance(PointV1 other) {
        return Math.sqrt(Math.pow((x - other.x), 2) + Math.pow((y - other.y), 2));
    }

    public double distanceFromOrigin() {
        return Math.abs(Math.sqrt(Math.pow((0 - x), 2) + Math.pow((0 - y), 2)));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
