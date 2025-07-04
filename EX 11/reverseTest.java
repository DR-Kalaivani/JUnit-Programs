package ex2.strrev;
importstatic org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class reverseTest {
	@Test
publicvoid testReverseNormalWord() {
        reverse r = new reverse();
assertEquals("olleh", r.reverseWord("hello"));
    }

@Test
publicvoid testReverseEmptyString() {
        reverse r = new reverse();
assertEquals("", r.reverseWord(""));
    }

@Test
publicvoid testReverseSingleString() {
        reverse r = new reverse();
assertEquals("a", r.reverseWord("a"));
    }

@Test
publicvoid testReverseNull() {
        reverse r = new reverse();
assertNull(r.reverseWord(null));
    }
}
