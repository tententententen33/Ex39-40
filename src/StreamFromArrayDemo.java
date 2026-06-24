import java.util.Arrays;

public class StreamFromArrayDemo {
	public static void main(String[] args) {
		String[] flowers = {"バラ", "あさがお", "チューリップ"};
		
		Arrays.stream(flowers)
			.forEach(System.out :: println);
	}
}
