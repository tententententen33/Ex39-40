import java.util.List;

public class PagingDemo {
	public static void main(String[] args) {
		List<String> items = List.of(
				"A", "B", "C", "D", "E", "F", "G", "H", "I", "J");

		int pageSize = 3;
		int page = 2; // 2 ページ目 

		items.stream()
				.skip((page - 1) * pageSize)
				.limit(pageSize)
				.forEach(System.out::println);
	}
}