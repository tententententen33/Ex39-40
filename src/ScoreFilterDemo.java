import java.util.List;

public class ScoreFilterDemo {
	public static void main(String[] args) {
		List<Integer> scores = List.of(45, 58, 70, 92, 100);

		scores.stream()
				.filter(score -> score >= 60)
				.forEach(score -> System.out.println(score + "点"));
	}
}
