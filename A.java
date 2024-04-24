package abstractclass;

public class A {
public int marks;
public int m1;
public int m2;
public int m3;
public int total;
public int percentage;
	public A(int m1,int m2,int m3) {
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public String toString() {
		return "m1: "+m1+"m2: "+m2+"m3: "+m3+"Marks: "+marks;
	}
	public void getPercentage() {
		total=m1+m2+m3;
		percentage=total/3;
		System.out.println("Percentage of Class A Students: "+percentage);	
	}

}
