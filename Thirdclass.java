package multilevel_inheritance;

public class Thirdclass extends Baseclass {
    public double weight;
    public double height;

    public Thirdclass(int id, String name, int age, String add, double weight, double height) {
        super(age, add); // Call superclass constructor with appropriate parameters
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override // Override toString() method to include weight and height
    public String toString() {
        return super.toString() + " ,Weight: " + weight + ",Height: " + height;
    }
    public void info() {
    	System.out.println("third class called");
    }
}
