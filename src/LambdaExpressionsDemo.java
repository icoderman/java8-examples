import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Instead of creating anonymous objects all day long, Java 8 comes with a much shorter syntax, lambda expressions
 */
public class LambdaExpressionsDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		// Before Java 8
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});

		// After Java 8
		Collections.sort(names, (String a, String b) -> {
			return b.compareTo(a);
		});

		// Or
		Collections.sort(names, (String a, String b) -> b.compareTo(a));

		// Or even
		Collections.sort(names, (a, b) -> b.compareTo(a));
	}
}
