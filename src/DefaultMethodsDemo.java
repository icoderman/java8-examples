/*
Java 8 enables us to add non-abstract method implementations to interfaces by utilizing the default keyword.
This feature is also known as Extension Methods.
*/
public class DefaultMethodsDemo {

	public static void main(String[] args) {
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
		};

		System.out.println(formula.calculate(100));
		System.out.println(formula.sqrt(16));
	}

}

interface Formula {
	double calculate(int a);

	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}

