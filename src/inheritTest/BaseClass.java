package inheritTest;


public class BaseClass {

	public void Boo() {
		System.out.println(this.getClass().getName() + " says, Boo!");
	}

	public void Shriek() {
		System.out.println(this.getClass().getName() + " says, Yikes!!!");
		
	}
}
