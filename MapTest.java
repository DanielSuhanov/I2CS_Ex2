package assignments.Ex2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Intro2CS, 2026A, this is a very
 */
class MapTest {
    /**
     */
    private int[][] _map_3_3 = {{0,1,0}, {1,0,1}, {0,1,0}};
    private Map2D _m0, _m1, _m3_3;
    @BeforeEach
    public void setuo() {
        _m0 = new Map(3,3,0);
        _m1 = new Map (3,3,0);
        _m3_3 = new Map(_map_3_3);
    }
    @Test
    @Timeout(value = 1, unit = SECONDS)
    void init() {
        int[][] bigarr = new int [500][500];
        _m1.init(bigarr);
        assertEquals(bigarr.length, _m1.getWidth());
        assertEquals(bigarr[0].length, _m1.getHeight());
        Pixel2D p1 = new Index2D(3,2);
        _m1.fill(p1,1, true);
    }

    @Test
    void testInit() {
        _m0.init(_map_3_3);
        _m1.init(_map_3_3);
        assertEquals(_m0, _m1);
    }
    @Test
    void testEquals() {
        assertEquals(_m0,_m1);
        _m0.init(_map_3_3);
        _m1.init(_map_3_3);
        assertEquals(_m0,_m1);
    }
    @Test
    void testMul() {
        Map2D m = new Map (new int[][]{{1,2},{3,4}});
        m.mul(2);
        assertEquals(2, m.getPixel(0,0));
        assertEquals(4, m.getPixel(0,1));
        assertEquals(6, m.getPixel(1,0));
        assertEquals(8, m.getPixel(1,1));
    }
    @Test
    void testAddMap2D() {
        Map2D a = new Map (new int[][]{{1,2},{3,4}});
        Map2D b = new Map (new int[][]{{5,6},{7,8}});
        a.addMap2D(b);

        assertEquals(6, a.getPixel(0,0));
        assertEquals(8, a.getPixel(0,1));
        assertEquals(10, a.getPixel(1,0));
        assertEquals(12, a.getPixel(1,1));
    }
}