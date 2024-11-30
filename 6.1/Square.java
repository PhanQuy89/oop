public class Square extends Rectangle {
    public Square() {}
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public String toString() {
        return "Square[" + super.toString() + ",side=" + getWidth() + "]";
    }
}
