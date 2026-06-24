import java.util.List;

public class LazyNoTerminalDemo {
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
				});

		System.out.println("ここまで来ました");
	}
}