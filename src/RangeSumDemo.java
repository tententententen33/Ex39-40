import java.util.stream.IntStream;

public class RangeSumDemo {
	public static void main(String[] args) {
		int total = IntStream.rangeClosed(1, 100)
				.sum();

		System.out.println("1 から 100 までの合計: " + total);
	}
}
