import java.util.stream.Stream;

public class StreamMapDemo {
	public static void main(String[] args) {
		Stream.of("バラ", "あさがお", "チューリップ", "さくら")
				.map(s -> s.length())
				.forEach(System.out::println);
	}
}