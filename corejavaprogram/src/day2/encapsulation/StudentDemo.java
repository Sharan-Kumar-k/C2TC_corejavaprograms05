package day2.encapsulation;

public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.setSid(1);
		s.setSname("sharan");
		s.setAvg(89.5F);
		System.out.println(s);
		Student S = new Student();
		S.setSid(2);
		S.setSname("sharan kumar");
		S.setAvg(90.5F);
		System.out.println(S);
		System.out.println("Student id:"+s.getSid());
		System.out.println("Student name:"+s.getSname());
		System.out.println("student avg"+s.getAvg());

	}

}
