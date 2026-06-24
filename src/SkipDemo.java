import java.util.stream.IntStream;

public class SkipDemo {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10)
				.skip(5)
				.forEach(System.out::println);
	}
}
