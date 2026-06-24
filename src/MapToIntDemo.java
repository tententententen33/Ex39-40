import java.util.stream.Stream;

public class MapToIntDemo {
	public static void main(String[] args) {
		Stream.of("バラ", "あさがお", "チューリップ", "さくら")
				.mapToInt(s -> s.length())
				.forEach(System.out::println);
		//sumやaverageはforEachと同じ終端処理だから
		//一緒には使えないため書いたらエラー。
	}
}