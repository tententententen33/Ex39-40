import java.util.List;

public class StreamFromListDemo {
	public static void main(String[] args) {
		List<String> words = List.of("ant", "elephant","hamster");
		
		words.stream()
			.forEach(System.out :: println);
	}
}
