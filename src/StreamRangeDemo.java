import java.util.stream.IntStream;

public class StreamRangeDemo {
	public static void main(String[] args) {
		System.out.println("range(10, 20)");
		IntStream.range(10, 20)
				.forEach(System.out::println);

		System.out.println("rangeClosed(10, 20)");
		IntStream.rangeClosed(10, 20)
				.forEach(System.out::println);
	}
}