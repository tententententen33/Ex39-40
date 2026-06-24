import java.util.Map;

public class StreamFromMapDemo {
	public static void main(String[] args) {
		Map<String,String> fruits = Map.of(
				"orange", "みかん",
				"apple", "りんご",
				"strawberry", "いちご"
				);
		
		fruits.entrySet()
			.stream()
			.forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));
	}
}
