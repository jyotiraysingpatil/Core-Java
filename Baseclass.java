package multilevel_inheritance;

public class Baseclass {
 private int id;
 public String name;
 
	public Baseclass(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "ID: "+id+"Name: "+name;
	}
  public void display() {
	  System.out.println("base class function");
  }
}
