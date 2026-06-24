import java.util.stream.IntStream;

public class LimitDemo {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10)
				.limit(3)
				.forEach(System.out::println);
	}
}