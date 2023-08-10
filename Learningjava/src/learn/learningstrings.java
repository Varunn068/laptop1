package learn;
import java.util.*;
public class learningstrings {

	public static void main(String[] args) {
		
		char []c= {'a','b','c','d'}; // creating String
		String s= new String(c);
		System.out.println(s);

		int size=s.length(); 
		System.out.println(size);
		
		String s1="Shivaramkarnath";
		System.out.println(s1.subSequence(1, 7));
		System.out.println(s1.contains("karnath"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.concat(" hariharapura"));
		
		String s2= "Shivamogga";
		String replaced=s2.replace('m', 'n');
		System.out.println(replaced);
		
		
		String s3="raju";
		String s4="raju";
		System.out.println(s3.equalsIgnoreCase(s4));
	
		String s5="this is index of example";  
		//passing substring  
		int index1=s5.indexOf("this");//returns the index of is substring  
		int index2=s5.indexOf("index");//returns the index of index substring  
		System.out.println(index1+"  "+index2);
		String s6="Varun";
     System.out.println(s6.toUpperCase());
		
		System.out.println(s6.trim());
		
		int values=12;
		String s7= String.valueOf(values);
		System.out.println(s7);
		
		String s8="sachin";
		s8.concat("Tendulkar");
		System.out.println(s8);
		
		//String Tokenizer : which is used to break the String into tokens
		StringTokenizer st = new StringTokenizer("my name is khan");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken()); 
	     }
	         StringTokenizer st1 = new StringTokenizer("my,name,is,khan");  
	         
	         // printing next token  }
	         System.out.println("Next token is : " + st1.nextToken(","));
	         
	         String s9="Sachin";    
	         System.out.println(s9.startsWith("Sa"));//true    
	         System.out.println(s9.endsWith("n"));//true  
	      }      
	     }  
	
	

