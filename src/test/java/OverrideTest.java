import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(value = {PersonFactory.class, PersonFactoryOverride.class})
class OverrideTest {

	@Autowired
	private Person person;

	@Test
	void testPerson() {
		assertEquals("Scrooge", person.getFirstName());
		assertEquals("Duck", person.getLastName());
		assertEquals(60, person.getAge());
	}
}
