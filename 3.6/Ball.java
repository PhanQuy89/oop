public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {

        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }
    public void reflectVertical() {
        yDelta = -yDelta;
    }
    public String toString() {
        return "Ball[(" + x + ", " + y + "), speed=(" + xDelta + ", " + yDelta + ")]";
    }
}