/*

 A so called functional interface must contain exactly one abstract method declaration. Each lambda expression of that
 type will be matched to this abstract method. Since default methods are not abstract you're free to add default methods
 to your functional interface.

 We can use arbitrary interfaces as lambda expressions as long as the interface only contains one abstract method.
 To ensure that your interface meet the requirements, you should add the @FunctionalInterface annotation.

*/

public class FunctionalInterfacesDemo {

	public static void main(String[] args) {
		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		Integer converted = converter.convert("123");
		System.out.println(converted);    // 123
	}

}

@FunctionalInterface
interface Converter<F, T> {
	T convert(F from);

	// we can't add more then one abstract method:
	//T convert2(F from);


	//but we can add unlimited default methods:
	default void hello() {
		System.out.println("Hello woruld");
	}

}
