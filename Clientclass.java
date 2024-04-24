package abstractclass;

public abstract class Clientclass {

	public static void main(String[] args) {
	  A a=new A(80,50,60);
	  B b=new B(80,60,70,50);
   a.getPercentage();
   b.getPercentage();
	}

	protected abstract void getPercentage();

}
