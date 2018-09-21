package AdvancedJavaExam2;

public class Person {
	static int numberOfPerson=0;
	
	int age;
	String name;
	
	public Person()
	{
		numberOfPerson++;
		this.age = 12;
		this.name = "";
	}
	
	public Person(int age, String name)
	{
		numberOfPerson++;
		this.age = age;
		this.name = name;
	}
	
	public void selfIntroduce()
	{
		System.out.println("내 이름은 "+name+"이며, 나이는 "+ age +"입니다.");
	}
	
	public static int getPopulation()
	{
		return numberOfPerson;
	}
	
	
}
