import org.junit.Test;
import static org.junit.Assert.*;

public class twoStringMethodsTest {

    //----------------------------------------------------
    @Test
    public void abcTest1() {
        boolean result = twoStringMethods.abcTest("123abc");
        assertTrue(result);
    }

    @Test
    public void abcTest2() {
        boolean result = twoStringMethods.abcTest("123.abc");
        assertEquals(false, result);
    }

    @Test
    public void abcTest3() {
        boolean result = twoStringMethods.abcTest("abc.123");
        assertEquals(true, result);
    }

    @Test
    public void abcTest4() {
        boolean result = twoStringMethods.abcTest("");
        assertEquals(false, result);
    }

    @Test
    public void abcTest5() {
        boolean result = twoStringMethods.abcTest(".abcabc");
        assertEquals(true, result);
    }

    @Test
    public void abcTest6() {
        boolean result = twoStringMethods.abcTest("abc.abc");
        assertEquals(true, result);
    }

    //----------------------------------------------------
    @Test
    public void alternateStringsTest1() {
        String result = twoStringMethods.alternateStrings("abc", "xyz");
        assertEquals("axbycz", result);
    }

    @Test
    public void alternateStringsTest2() {
        String result = twoStringMethods.alternateStrings("Hi", "There");
        assertEquals("HTihere", result);
    }

    @Test
    public void alternateStringsTest3() {
        String result = twoStringMethods.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee", result);
    }

    @Test
    public void alternateStringsTest4() {
        String result = twoStringMethods.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee", result);
    }

    @Test
    public void alternateStringsTest5() {
        String result = twoStringMethods.alternateStrings("", "");
        assertEquals("", result);
    }
}