package AdvancedJavaExam2;

public class PersonTest {
	public static void main(String[] args) {

		Person person1 = new Person(12,"���ڹ�");
		System.out.println("���� �α����� " + Person.getPopulation() + "�� �Դϴ�.");
		Person person2 = new Person(27,"���ڹ�");
		System.out.println("���� �α����� " + Person.getPopulation() + "�� �Դϴ�.");
		Person person3 = new Person(28, "���ڹ�");
		System.out.println("���� �α����� " + Person.getPopulation() + "�� �Դϴ�.");
		
		person1.selfIntroduce();
		person2.selfIntroduce();
		person3.selfIntroduce();

		
	}
}
