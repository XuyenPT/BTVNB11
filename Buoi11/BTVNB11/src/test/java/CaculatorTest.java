import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CaculatorTest {
    Caculator caculator = new Caculator();
    @Test
    void assertEqualExample(){
        assertEquals (3, caculator.dev(12, 4));
        assertEquals (15, caculator.mul(3, 5));
    }
    @Test
    void assertNotEqualExample(){
        assertNotEquals(5, caculator.dev(20, 5));
        assertNotEquals(12, caculator.mul(4, 2));
    }
    @Test
    void assertArrayEqualExample(){
        assertArrayEquals(new int[]{5, 3, 10, 12}, new int[]{5, 3, 10, 12});
        assertArrayEquals(new int[]{5, 2, 10, 12}, new int[]{5, 3, 10, 12});
    }
    @Test
    void assertNullExample(){
        String nullString = null;
        String string = "abc";
        assertNull (nullString);
        assertNull (string);
    }
    @Test
    void assertNotNullExample(){
        String nullString = null;
        String notNullString = "Xuyên test";
        assertNotNull (nullString);
        assertNotNull (notNullString);

    }
    @Test
    void assertTrueExample(){
        assertTrue(true);
        assertTrue(5>4,"5 lớn hơn 4");
    }
    @Test
    void assertFalseExample(){
        assertFalse(false);
        assertFalse(5<4, "5 nhỏ hơn 4");
    }

}
