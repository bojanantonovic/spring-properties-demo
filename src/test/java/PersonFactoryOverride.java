import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class PersonFactoryOverride {

	@Bean
	Person createPerson() {
		return new Person("Scrooge", "Duck", 60);
	}
}
