import java.util.stream.Stream;

public class GenerateVsIterateDemo {
	public static void main(String[] args) {
		System.out.println("generate: 同じ文字を 5 回作る");
		Stream.generate(() -> "Java")
				.limit(5)
				.forEach(System.out::println);

		System.out.println("iterate: 1 から1 ずつ増やす");
		Stream.iterate(1, n -> n + 1)
				.limit(5)
				.forEach(System.out::println);
	}
}
