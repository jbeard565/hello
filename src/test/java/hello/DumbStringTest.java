package hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DumbStringTest {

	@Test
	void test() {
		DumbString dsEmpty = new DumbString();
		assertEquals("", dsEmpty.toString());
		assertEquals("", "" + dsEmpty);

		DumbString ds2 = DumbString.from("this is a test");
		assertEquals(DumbString.from("this is a test"), ds2);
	}

}
