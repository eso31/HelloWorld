import static org.junit.Assert.assertEquals;
import org.junit.Test;
//java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore
public class Calculadora{
	/*public static void main(String args[]){
		new Calculadora();
	}
	
	public Calculadora(){
		OperacionesBasicas ob = new OperacionesBasicas();
		double a = ob.sum(5,5);
		System.out.println(""+a);
	}*/
	
	
	@Test
	public void TestMultiplication(){
		assertEquals("10x0 must be 0",0,new OperacionesBasicas().sum(10,0));
	}
	
	@Test
	public void EasyTest(){
		assertEquals(5,5);
	}
	
	
	/**CLASE OPERACIONES*/
	public class OperacionesBasicas{
		public int sum(int a, int b){
			return a*b;
		}
	}
	
}