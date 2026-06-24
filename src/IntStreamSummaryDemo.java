import java.util.stream.IntStream;

public class IntStreamSummaryDemo {
	public static void main(String[] args) {
		int total = IntStream.of(45, 58, 70, 92, 100).sum();
		
		double average = IntStream.of(45, 58, 70, 92, 100).average().orElse(0.0);
		
	    System.out.println("合計: " + total); 
	    System.out.println("平均: " + average); 
	}
}
