package multilevel_inheritance;

public class Derivedclass extends Baseclass {
    public int age;
    public String add;

    public Derivedclass(int id, String name, int age, String add) {
        super(id, name);
        this.age = age;
        this.add = add;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String toString() {
        return super.toString() + " Age: " + age + " Address: " + add;
    }
    
    public void derivedfun() {
    	System.out.println("derived class function");
    }
}
