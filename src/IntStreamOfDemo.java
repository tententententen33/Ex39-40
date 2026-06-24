import java.util.stream.IntStream;

public class IntStreamOfDemo {
	public static void main(String[] args) {
		IntStream.of(45, 58, 70, 92, 100)
				.forEach(System.out::println);
	}
}
