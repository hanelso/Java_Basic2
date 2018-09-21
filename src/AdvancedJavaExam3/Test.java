package AdvancedJavaExam3;

public class Test {
	
	String subject ;
	int point;
	
	public void setPoint(String subject, int point)
	{
		this.subject = subject;
		this.point = point;
	}
	
	String getPoint() {
		return subject + ":" + point;
	}
}
