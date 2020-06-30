
class Classe1 {
	 public void m() {
		 System.out.println(3);
	 }
}
class Classe2 extends Classe1{
	
	public void m() {
		super.m();
		System.out.println(2);
	}
}	

	
	
	
	
	
	
	//int y = 10;
	//void mudar (Exemplo e) {
	//	e.y = y + 5;
	//}
//	int i;
//	boolean b;
public class Exemplo {
	public static void main(String[] args) {
		Classe1 c1 = new Classe1();
		c1.m();
		
		Classe2 c2 = new Classe2();
		c2.m();
	}
	
}
	
	//	Exemplo e1 = new Exemplo();
	//	Exemplo e2 = new Exemplo();
	//	e1.mudar(e2);
	//	System.out.println(e1.y);
	//	System.out.println(e2.y);
		
	//	Exemplo e = new Exemplo();
	//	e.i = e.i + 10;
	//	System.out.println(e.i);
	//	System.out.println(e.b);
	


