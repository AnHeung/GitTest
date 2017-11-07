package lambdaExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class FunctionExam {


	private static List<Student> list = Arrays.asList(
										new Student("kuma", 90, 90) 
										, new Student("gom", 70, 70));
	
	

	public static void printString(Function<Student, String> function){
		
		for(Student stu : list){
			System.out.println(function.apply(stu) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function){
		
		for(Student stu : list){
				System.out.println(function.applyAsInt(stu) + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		System.out.println("학생 이름 : ");
		printString((student)-> student.getName());
		Function<Student, Integer> getEnglish = Student::getEnglishScore;
		Function<Student,String>getName = Student::getName;
	}
}


class Student{
	

	private String name;
	private int englishScore;
	private int mathScore;
	private boolean what = false;
	
	
	public Student(String name, int englishScore, int mathScore) {
		super();
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getWhat(){
		return what;
	}


	public int getEnglishScore() {
		return englishScore;
	}


	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}


	public int getMathScore() {
		return mathScore;
	}


	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	
}

