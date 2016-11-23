package inheritTest;


public class CompClass  {

	private BaseClass mbc;
	
	public CompClass(BaseClass mbc) {
		this.mbc = mbc;
	}
	
	public CompClass() {
		this.mbc = null;
	}

	public void Boo() {
		System.out.println(this.getClass().getName() + " says, Boo!");
	}

	public void Boo2() {
		System.out.println(this.getClass().getName() + " says, Boo2!, and ...");
		this.mbc.Boo();
	}

	
}
