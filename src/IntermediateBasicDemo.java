import java.util.List;

public class IntermediateBasicDemo {
	public static void main(String[] args) {
		List<String> words = List.of("ant", "elephant", "hamster", "dog");
		
		words.stream()
			.filter(word -> word.length() > 3)
			.map(String :: toUpperCase)
			.forEach(System.out :: println);
	}
}
