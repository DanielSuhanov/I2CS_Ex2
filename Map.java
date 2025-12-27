package assignments.Ex2;
import java.io.Serializable;
/**
 * This class represents a 2D map (int[w][h]) as a "screen" or a raster matrix or maze over integers.
 * This is the main class needed to be implemented.
 *
 * @author boaz.benmoshe
 *
 */
public class Map implements Map2D, Serializable {
	private int[][] map;
	/**
	 * Constructs a w*h 2D raster map with an init value v.
	 * @param w
	 * @param h
	 * @param v
	 */
	public Map(int w, int h, int v) {init(w, h, v);}
	/**
	 * Constructs a square map (size*size).
	 * @param size
	 */
	public Map(int size) {this(size,size, 0);}

	/**
	 * Constructs a map from a given 2D array.
	 * @param data
	 */
	public Map(int[][] data) {
		init(data);
	}
	@Override
	public void init(int w, int h, int v) {
		if (w <= 0 || h <= 0) {
			throw new IllegalArgumentException();
		}
		map = new int[w][h];
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				map[x][y] = v;
			}
		}
	}
	@Override
	public void init(int[][] arr) {
		if (arr == null || arr.length == 0 || arr[0] == null || arr[0].length == 0) {
			throw new RuntimeException("Bad array");
		}
		int w = arr.length;
		int h = arr[0].length;

		for (int x = 0; x < w; x++) {
			if (arr[x] == null || arr[x].length != h) {
				throw new RuntimeException("Ragged array");
			}
		}
		map = new int[w][h];
		for (int x = 0; x < w; x++) {
			System.arraycopy(arr[x], 0, map[x], 0, h);
		}
	}
	@Override
	public int[][] getMap() {
		int w = getWidth();
		int h = getHeight();
		int[][] copy = new int[w][h];
		for (int x = 0; x < w; x++) {
			System.arraycopy(map[x], 0, copy[x], 0, h);
		}
		return copy;
	}
	@Override
	public int getWidth() {
	return map.length;
	}
	@Override
	public int getHeight() {
		return map[0].length;
	}
	@Override
	public int getPixel(int x, int y) {
		return map[x][y];
	}
	@Override
	public int getPixel(Pixel2D p) {
		if (p == null) throw new RuntimeException("p is null");
		return getPixel(p.getX(), p.getY());
	}
	@Override
	public void setPixel(int x, int y, int v) {
		map[x][y] = v;
	}
	@Override
	public void setPixel(Pixel2D p, int v) {
		if (p == null) throw new RuntimeException("p is null");
		setPixel(p.getX(), p.getY(), v);
	}

	@Override
	public boolean isInside(Pixel2D p) {
		if (p == null) return false;
		int x = p.getX();
		int y = p.getY();
		return x >= 0 && x < getWidth() && y >= 0 && y < getHeight();
	}

	@Override
	public boolean sameDimensions(Map2D p) {
		if (p == null) return false;
		return this.getWidth() == p.getWidth() && this.getHeight() == p.getHeight();
	}

	@Override
	public void addMap2D(Map2D p) {

	}

	@Override
	public void mul(double scalar) {

	}

	@Override
	public void rescale(double sx, double sy) {

	}

	@Override
	public void drawCircle(Pixel2D center, double rad, int color) {

	}

	@Override
	public void drawLine(Pixel2D p1, Pixel2D p2, int color) {

	}

	@Override
	public void drawRect(Pixel2D p1, Pixel2D p2, int color) {

	}

	@Override
	public boolean equals(Object ob) {
		if (this == ob) return true;
		if (!(ob instanceof Map2D)) return false;

		Map2D other = (Map2D)ob;
		if (!this.sameDimensions(other)) return false;

		for (int x = 0; x < getWidth(); x++) {
			for (int y = 0; y < getHeight(); y++) {
				if (this.getPixel(x, y ) != other.getPixel(x, y)) {
					return false;
				}
			}
		}
		return true;
	}
	@Override
	/**
	 * Fills this map with the new color (new_v) starting from p.
	 * https://en.wikipedia.org/wiki/Flood_fill
	 */
	public int fill(Pixel2D xy, int new_v,  boolean cyclic) {
		int ans = -1;

		return ans;
	}

	@Override
	/**
	 * BFS like shortest the computation based on iterative raster implementation of BFS, see:
	 * https://en.wikipedia.org/wiki/Breadth-first_search
	 */
	public Pixel2D[] shortestPath(Pixel2D p1, Pixel2D p2, int obsColor, boolean cyclic) {
		Pixel2D[] ans = null;  // the result.

		return ans;
	}
	@Override
	public Map2D allDistance(Pixel2D start, int obsColor, boolean cyclic) {
		Map2D ans = null;  // the result.

		return ans;
	}
	////////////////////// Private Methods ///////////////////////

}
