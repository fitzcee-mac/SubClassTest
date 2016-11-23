package inheritTest;


public class SubClass extends BaseClass {

	public SubClass() {
	}

	public void Boo() {
		System.out.println(this.getClass().getName() + " says, Boo!");
	}

	
}
