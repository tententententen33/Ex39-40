import java.util.List;

public class StreamMapUpperDemo {
	public static void main(String[] args) {
		List<String> words = List.of("ant", "elephant", "hamster");

		words.stream()
				.map(String::toUpperCase)
				.forEach(System.out::println);
	}
}