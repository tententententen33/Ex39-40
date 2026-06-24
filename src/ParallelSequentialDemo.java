import java.util.List;

public class ParallelSequentialDemo {
	public static void main(String[] args) {
		var stream = List.of("A", "B", "C", "D").stream();

		stream.parallel()
				.sequential()
				.forEach(System.out::println);
	}
}
