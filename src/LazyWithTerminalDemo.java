import java.util.List;

public class LazyWithTerminalDemo {
	public static void main(String[] args) {
		List<String> words = List.of("ant", "elephant", "hamster", "dog");

		words.stream()
				.filter(word -> {
					System.out.println("filter 確認: " + word);
					return word.length() > 3;
				})
				.map(word -> {
					System.out.println("map 確認: " + word);
					return word.toUpperCase();
				})
				.forEach(word -> System.out.println("出力: " + word));
	}
}