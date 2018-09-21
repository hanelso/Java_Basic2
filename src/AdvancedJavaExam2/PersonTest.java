package AdvancedJavaExam2;

public class PersonTest {
	public static void main(String[] args)
	{
		Person person = new Person();
		person = new Person();
		
		Person person2 = new Person(19,"±èÃ¶¼ö");
		
		person.selfIntroduce();
		person2.selfIntroduce();
		
		System.out.println(person.getPopulation());
	}
}
