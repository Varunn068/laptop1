package learn;

public class Stringlearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Rcb";
		String s1="Rcb is great";
		String s2=String.format("faf is the captian of %s",s);
		System.out.println(s2);
		
		String s4="java string split method by javatpoint";  
		//String[] words=s4.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		//for(String w:words){  
		//System.out.println(w);  
		//}
		for(String w1:s4.split("\\s",3))
		{
			System.out.println(w1);
		}

	}

}
