import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(PersonFactory.class)
class PersonFactoryIntegrationTest {

	@Autowired
	private Person person;

	@Test
	void testPerson() {
		assertEquals("Donald", person.getFirstName());
		assertEquals("Duck", person.getLastName());
		assertEquals(30, person.getAge());
	}
}
