import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(value = {PersonFactoryOverride.class, PersonFactory.class})
class NoOverrideTest {

	@Autowired
	private Person person;

	@Test
	void testPerson() {
		assertEquals("Donald", person.getFirstName());
		assertEquals("Duck", person.getLastName());
		assertEquals(30, person.getAge());
	}
}
