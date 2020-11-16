package CaesarCipher;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeTest {
    @Test
    public void newEncode_getText() {
        Encode testingEncode = new Encode("abc", 1);
        assertEquals("abc", testingEncode.getText());
    }
    @Test
    public void newEncode_getKey() {
        Encode testingEncode = new Encode("abc", 1);
        assertEquals(1, testingEncode.getKey());
    }
    @Test
    public void newEncode_Encrypt_Text() {
        Encode testingEncode = new Encode("mop", 1);
        assertEquals("opq", testingEncode.encrypt());
    }
    @Test
    public void newEncode_GreaterThan_Z() {
        Encode testingEncode = new Encode("z", 1);
        assertEquals("a", testingEncode.encrypt());
    }
    @Test
    public void newEncode_Emptyspace() {
        Encode testingEncode = new Encode(" ", 1);
        assertEquals(" ", testingEncode.encrypt());
    }
}
