package AdvancedJavaExam1;

import java.util.Scanner;

public class CalcApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String c = scanner.next();
		Arithmetic Ari = null;

		if (c.equals("+"))
			Ari = new Add();
		else if (c.equals("-"))
			Ari = new Sub();
		else if (c.equals("*"))
			Ari = new Mul();
		else if (c.equals("/"))
			Ari = new Div();

		System.out.println(Ari.calculate(a, b));
		
		scanner.close();

	}
}
