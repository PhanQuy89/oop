public class Point3D extends Point2D {
    private float z;
    public Point3D() {
        super();
        z = 0.0f;
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[]{x, y, z};
    }
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}