import java.util.stream.Stream;

public class StreamBuilderDemo {
	public static void main(String[] args) {
		Stream.Builder<String> builder = Stream.builder();
		
		builder.add("いちじく");
		builder.add("にんじん");
		builder.add("さんしょ");
		
		builder.build()
			.forEach(System.out :: println);
	}
}
