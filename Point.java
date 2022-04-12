public class Point {
    private double pointX;
    private double pointY;

    /**
     * constuctors.
     */

    public Point(double pointX, double pointY) {
        this.pointY = pointY;
        this.pointX = pointX;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance.
     */

    public double distance(Point other) {
        double x1 = Math.pow(this.pointX - other.pointX, 2);
        double x2 = Math.pow(this.pointY - other.pointY, 2);
        return Math.sqrt(x1 + x2);
    }
}
