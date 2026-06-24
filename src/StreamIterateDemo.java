import java.util.stream.Stream;

public class StreamIterateDemo {
	public static void main(String[] args) {
		Stream.iterate(1, num -> num * 2)
			.limit(10)
			.forEach(System.out :: println);
	}
}
