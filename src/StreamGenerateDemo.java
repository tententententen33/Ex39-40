import java.util.Random;
import java.util.stream.Stream;

public class StreamGenerateDemo {
	public static void main(String[] args) {
		Random random = new Random();
		
		Stream.generate(() -> random.nextInt(100))
			.limit(10)
			.forEach(System.out :: println);
	}
}
