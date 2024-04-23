package multilevel_inheritance;

public class Clientclass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baseclass b=new Baseclass(101,"john");
		Derivedclass d=new Derivedclass(102,"jony",1,"pune");
		d.display();
		d.derivedfun();

	}

}
