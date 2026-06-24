import java.util.Comparator;
import java.util.List;

public class IntermediatePipelineDemo {
	public static void main(String[] args) {
		List<String> words = List.of("Java", "API", "Stream", "Lambda", "Map",
				"Filter");

		words.stream()
				.filter(word -> word.length() >= 4) // 4 文字以上だけ残す 
				.map(String::toUpperCase) // 大文字に変換する 
				.sorted(Comparator.reverseOrder()) // 逆順に並べる 
				.limit(3) // 先頭 3 件だけ残す 
				.forEach(System.out::println); // 表示する 
	}
}