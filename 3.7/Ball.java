public class Ball {
    private float x;
    private float y;
    private float z;

    public Ball(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // Tương tự cho các phương thức getter và setter của y và z

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
