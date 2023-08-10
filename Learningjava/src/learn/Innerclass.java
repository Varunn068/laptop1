package learn;
import java.util.*;

import learn.C.D;

class A   //Member class
{
	int i;
	
	class B
	{
	int j;	
	}
}                      //Member class

 class C {                     //Static class
	 
	  static int k;
	 
	 static class D {
		 int l;
	 }
 }                               //Static class

 
 class E                  // annonymous class
 {
	 void hi()
		{
			System.out.println("hi");
		}
 }                           // annonymous class
 
public class Innerclass {

	public static void main(String[] args) {
	
		A to= new A();      //Member class
		to.i=4;             //Member class
		A.B to1= to.new B(); //Member class
		to1.j=3;
		
		C yo =new C();     //Static class
		C.k=9;            //Static class
		C.D yo1= new D();
		yo1.l=8;          //Static class
		
		E zo = new E()                // annonymous class
				{
			
			void hi()                        // annonymous class
			{
				System.out.println("hi");
			}
				};
				zo.hi();                    // annonymous class
}
}