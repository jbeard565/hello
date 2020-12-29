package hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DumbStringTest {

	@Test
	void test() {
		DumbString ds = new DumbString();
		assertEquals("", ds.toString());
		assertEquals("", ""+ds);
		
		assertEquals("asdf", new DumbString("asdf").toString());
	}

}
