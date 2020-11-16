package CaesarCipher;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTest {
    @Test
    public void newDecode_getText() {
        Decode testingDecode = new Decode("abc", 1);
        assertEquals("abc", testingDecode.getText());
    }
    @Test
    public void newDecode_getKey() {
        Decode testingDecode = new Decode("abc", 1);
        assertEquals(1, testingDecode.getKey());
    }
    @Test
    public void newDecode_Encrypt_Text() {
        Decode testingEncode = new Decode("opq", 1);
        assertEquals("mop", testingEncode.decrypt());
    }
    @Test
    public void newDecode_LessThan_a() {
        Decode testingEncode = new Decode("a", 1);
        assertEquals("z", testingEncode.decrypt());
    }
    @Test
    public void newDecode_Empty_Space() {
        Decode testingEncode = new Decode(" ", 1);
        assertEquals(" ", testingEncode.decrypt());
    }
}