package assignments.Ex2;

public class Index2D implements Pixel2D {

    private int x;
    private int y;

    public Index2D(int w, int h) {

        this.x = w;
        this.y = h;
    }
    public Index2D(Pixel2D other) {
        if (other == null) {
            throw new NullPointerException();
        }
        this.x = other.getX();
        this.y = other.getY();
    }
    @Override
    public int getX() {

        return x;
    }

    @Override
    public int getY() {

        return y;
    }

    @Override
    public double distance2D(Pixel2D p2) {
        if (p2 == null) {
            throw new RuntimeException("p2 is null");
        }
        int dx = this.x - p2.getX();
        int dy = this.y - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null) return false;
        if (!(p instanceof Index2D)) return false;

        Pixel2D other = (Pixel2D) p;
        return this.x == other.getX() && this.y == other.getY();
    }
}
