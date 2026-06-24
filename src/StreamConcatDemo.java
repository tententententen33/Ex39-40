import java.util.stream.Stream;

public class StreamConcatDemo {
	public static void main(String[] args) {
		Stream<String> fruits = Stream.of("りんご", "みかん", "いちご");
		Stream<String> vegetables = Stream.of("にんじん", "だいこん", "ごぼう");
		
		Stream.concat(fruits, vegetables)
			.forEach(System.out :: println);
	}
}
