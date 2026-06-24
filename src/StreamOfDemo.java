import java.util.stream.Stream;

public class StreamOfDemo {
	public static void main(String[] args) {
		Stream.of("first", "second", "third")
			.forEach(System.out :: println);
	}
}
