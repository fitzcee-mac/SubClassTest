package inheritTest;


public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		BaseClass bc = BaseClassBuilder.getOneMBC();
		bc.Boo();
		
		CompClass cc =  new CompClass(BaseClassBuilder.getOneMBC());
		SubClass sc =  new SubClass();

		sc.Boo();
		cc.Boo();
		cc.Boo2();
		
		bc.Shriek();
		sc.Shriek();
	}

}
