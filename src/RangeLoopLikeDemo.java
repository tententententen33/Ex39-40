import java.util.stream.IntStream;

public class RangeLoopLikeDemo {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 5)
				.forEach(i -> System.out.println(i + "回目の処理です"));
	}
}
