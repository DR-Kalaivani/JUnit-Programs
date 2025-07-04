''JUnitTestClass
package ex3.strcmp;
importstatic org.junit.jupiter.api.Assertions.*;
importorg.junit.jupiter.api.Test;

publicclass StrcmpTest {

	@Test
	void testCase1_sameStrings() {
	        Strcmp util = new Strcmp();
	assertTrue(util.areStringsEqual("hello", "hello")); // Expected: true
	    }

	@Test
	void testCase2_differentStrings() {
	        Strcmp util = new Strcmp();
	assertFalse(util.areStringsEqual("hello", "world")); // Expected: false
	    }

	@Test
	void testCase3_oneNull() {
	        Strcmp util = new Strcmp();
	assertFalse(util.areStringsEqual("hello", null)); // Expected: false
	    }

	@Test
	void testCase4_bothNull() {
	        Strcmp util = new Strcmp();
	assertFalse(util.areStringsEqual(null, null)); // Expected: false
	    }

	@Test
	void testCase5_emptyStrings() {
	        Strcmp util = new Strcmp();
	assertTrue(util.areStringsEqual("", "")); // Expected: true
	    }
}
