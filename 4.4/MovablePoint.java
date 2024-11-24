public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MovablePoint() {
        super();
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }
    public MovablePoint move() {
        float x = xSpeed;
        float y = ySpeed;
        return this;
    }
    public String toString() {
        return "(" + x + ", " + y + "), speed= (" + xSpeed + ", " + ySpeed + ")";
    }
}