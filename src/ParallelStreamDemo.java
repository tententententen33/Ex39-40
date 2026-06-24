import java.util.List;

public class ParallelStreamDemo {
	public static void main(String[] args) {
		List<String> words = List.of("Java", "API", "Stream", "Lambda", "Silver");
		
		words.parallelStream()
			.forEach(word -> System.out.println(Thread.currentThread().getName() + ":" + word));
	}
}
