package space.bumtiger.record.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void test() {
		int id = 12345;
		Person myself = new Person(id, "박");
		assertEquals(myself.getId(), id);		
	}

}
