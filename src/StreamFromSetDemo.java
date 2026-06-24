import java.util.HashSet;
import java.util.Set;

public class StreamFromSetDemo {
	public static void main(String[] args) {
		Set<String> words = new HashSet<>(Set.of("Java", "API", "Stream", "Lambda"));
		
		words.stream()
			.forEach(System.out :: println);
	}
}
