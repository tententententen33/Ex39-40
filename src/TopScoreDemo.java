import java.util.Comparator;
import java.util.List;

public class TopScoreDemo {
	public static void main(String[] args) {
		List<Integer> scores = List.of(45, 58, 70, 92, 100, 83, 76);

		scores.stream()
				.sorted(Comparator.reverseOrder())
				.limit(3)
				.forEach(score -> System.out.println(score + "点"));
	}
}