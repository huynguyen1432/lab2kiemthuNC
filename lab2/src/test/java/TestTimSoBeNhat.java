import com.example.lab2.TimPhanTuBeNhatTrongMang;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTimSoBeNhat {
    TimPhanTuBeNhatTrongMang timSoBeNhatTrongMangService = new TimPhanTuBeNhatTrongMang();
    @Test
    public void testCaseMangNull() {
        int[] mang = null;

        assertThrows(NullPointerException.class, () -> {
            timSoBeNhatTrongMangService.timSoBeNhatMang(mang);
        });
    }
    @Test
    public void testCaseMangRong() {
        int[] mang = {};

        assertThrows(NullPointerException.class, () -> {
            timSoBeNhatTrongMangService.timSoBeNhatMang(mang);
        });
    }
    @Test
    public void testCase2() {
        int[] mang = {4, 2, 8, 1,0};
        assertEquals(0, timSoBeNhatTrongMangService.timSoBeNhatMang(mang));
    }
    @Test
    public void testCase3() {
        int[] mang = {4, 2, 8,9};
        assertEquals(2, timSoBeNhatTrongMangService.timSoBeNhatMang(mang));
    }
    @Test
    public void testCase4() {
        int[] mang = {4, 2, 8, 1,10};
        assertEquals(3, timSoBeNhatTrongMangService.timSoBeNhatMang(mang));
    }
    @Test
    public void testCase5() {
        int[] mang = {4, 2,0, 8, 1};
        assertEquals(0, timSoBeNhatTrongMangService.timSoBeNhatMang(mang));
    }
    @Test
    public void testCase6() {
        int[] mang = {4, 2, 8, 1,9,4,7,1,4,0};
        assertEquals(0, timSoBeNhatTrongMangService.timSoBeNhatMang(mang));
    }
    @Test
    public void testCase7() {
        int[] mang = {4, 2, 8, 1,5,1,2};
        assertEquals(1, timSoBeNhatTrongMangService.timSoBeNhatMang(mang));
    }

    @Test
    public void testCase8() {
        int[] mang = {4, 2, 8,2,5,};
        assertEquals(2, timSoBeNhatTrongMangService.timSoBeNhatMang(mang));
    }
    @Test
    public void testCase9() {
        int[] mang = {4, 2};
        assertEquals(2, timSoBeNhatTrongMangService.timSoBeNhatMang(mang));
    }
    @Test
    public void testCase10() {
        int[] mang = {4,5,8,9,3,2,1};
        assertEquals(1, timSoBeNhatTrongMangService.timSoBeNhatMang(mang));
    }

}
