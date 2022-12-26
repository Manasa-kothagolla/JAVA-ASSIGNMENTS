import java.util.*;
class Example1
{
	public static void main(String[] args) {
		System.out.println(" to check a character at given index position" );
		System.out.println(".............................................");
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		String str="Hello World";
		if (index>=0 && index<=str.length()-1 ) 
		{
		          System.out.println(str.charAt(index));	
		}
		else
		{
			       System.out.println(index+" is not found there exists only 11 characters"); 
		}
		
		}
	}