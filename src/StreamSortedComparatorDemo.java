import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSortedComparatorDemo {
	public static void main(String[] args) {
		Stream.of(70, 45, 100, 58, 92)
				.sorted(Comparator.reverseOrder())
				.forEach(System.out::println);
	}
}