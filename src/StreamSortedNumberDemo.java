import java.util.stream.Stream;

public class StreamSortedNumberDemo {
	public static void main(String[] args) {
		Stream.of(70, 45, 100, 58, 92)
				.sorted()
				.forEach(System.out::println);
	}
}
