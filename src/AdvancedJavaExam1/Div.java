package AdvancedJavaExam1;

public class Div implements Arithmetic{
	public int calculate(int a, int b)
	{
		if (b != 0)
			return a/b;
		else {
			System.out.println("0���� ������ �����ϴ�.");
			return -1;
		}
	}
}
