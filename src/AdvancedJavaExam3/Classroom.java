package AdvancedJavaExam3;

public class Classroom {
	public static void main(String[] args)
	{
		
		Student kim = new Student(12, "������", 3);
		kim.test[0].setPoint("����",95);
		kim.test[1].setPoint("����",83);
		kim.test[2].setPoint("����",76);
		kim.printScore();
		
		Student lee = new Student(7,"�̹α�", 3);
		lee.test[0].setPoint("����",66);
		lee.test[1].setPoint("����",22);
		lee.test[2].setPoint("����",18);
		lee.printScore();
	}
}