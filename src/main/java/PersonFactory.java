import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("person-configuration.properties")
class PersonFactory {

	@Value("${first.name}")
	private String firstName;
	@Value("${last.name}")
	private String lastName;
	@Value("${age}")
	private int age;

	@Bean
	Person createPerson() {
		return new Person(firstName, lastName, age);
	}
}
