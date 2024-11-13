import com.example.lab2.TruyXuat1PhanTu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTruyXuat1PhanTu {
    TruyXuat1PhanTu truyXuat1PhanTuMangService = new TruyXuat1PhanTu();
    @Test
    public void testcaseDung1() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(1, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 0));
    }
    @Test
    public void testcaseDung2() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(2, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 1));
    }
    @Test
    public void testcaseDung3() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(3, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 3));
    }
    @Test
    public void testcaseDung4() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(4, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 4));
    }
    @Test
    public void testcaseDung5() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(5, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 5));
    }
    @Test
    public void testcaseDung6() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(6, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 6));
    }
    @Test
    public void testcaseDung7() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(7, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 7));
    }
    @Test
    public void testcaseDung8() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 8);
        });
    }
    public void testcaseDung9() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(9, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 9));
    }
    @Test
    public void testcaseDung10() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        assertEquals(10, truyXuat1PhanTuMangService.truyXuat1PhanTu(mang, 10));
    }
}
