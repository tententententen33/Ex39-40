import java.util.stream.Stream;

public class StreamSortedDemo {
	public static void main(String[] args) {
		Stream.of("banana", "apple", "orange", "grape")
				.sorted()
				.forEach(System.out::println);
	}
}
