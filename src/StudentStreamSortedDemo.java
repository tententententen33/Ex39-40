import java.util.Comparator;
import java.util.List;

class Student40 {
	private String name;
	private int score;
	
	public Student40(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getNume() {return name;};
	public int getScore() {return score;};
	
	@Override
	public String toString() {
		return name + ":" + score;
	}
}

public class StudentStreamSortedDemo {
	public static void main(String[] args) {
		List<Student40> students = List.of(
				new Student40("Sato", 70),
				new Student40("Tanaka", 92),
				new Student40("Suzuki", 70),
				new Student40("Yamada", 58)
				);
		
		students.stream()
			.sorted(Comparator.comparingInt(Student40 :: getScore).reversed())
			.forEach(System.out :: println);
	}
}
