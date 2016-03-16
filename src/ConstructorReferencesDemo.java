public class ConstructorReferencesDemo {

	public static void main(String[] args) {
		// Constructor References
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Peter", "Parker");
	}
}

class Person {
	private String firstName;
	private String lastName;

	Person() {}

	Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

interface PersonFactory<P extends Person> {
	P create(String firstName, String lastName);
}