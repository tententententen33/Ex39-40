import java.util.Map;

public class MapKeyValueStreamDemo {
	public static void main(String[] args) {
		Map<String, Integer> scores = Map.of("A001", 70, "A002", 92, "A003", 58);
		
		System.out.println("キーだけ");
		scores.keySet().stream()
			.forEach(System.out :: println);
		
		System.out.println("------------------");
		System.out.println("値だけ");
		scores.values().stream()
		 	.forEach(System.out :: println);
		
		System.out.println("------------------");
		System.out.println("キーと値");
		scores.entrySet().stream()
			.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
	}
}
