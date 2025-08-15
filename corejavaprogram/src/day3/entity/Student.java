package day3.entity;

public class Student {
private int sid;
private String sname;
public Student() {
	System.out.println("Constructor called");
}
public Student(int sid, String sname) {
	this();
	this.sid=sid;
	this.sname =sname;
	System.out.println("Constructor called");
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + sname + "]";
}

}
