
public class MethodReferencesDemo {

	public static void main(String[] args) {
		// Method References
		SimpleConverter<String, Integer> converter = Integer::valueOf;

		Integer converted = converter.convert("123");
		System.out.println(converted);    // 123

		//
		Something something = new Something();
		SimpleConverter<String, String> converter2 = something::startsWith;
		String converted2 = converter2.convert("Java");
		System.out.println(converted2);    // "J"


	}
}

@FunctionalInterface
interface SimpleConverter<F, T> {
	T convert(F from);
}

class Something {
	String startsWith(String s) {
		return String.valueOf(s.charAt(0));
	}
}

