package AdvancedJavaExam1;

import java.util.Scanner;

public class CalcApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("두 정수와 연산자를 입력하시오 >> ");
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
