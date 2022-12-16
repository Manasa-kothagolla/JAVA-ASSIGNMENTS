import java.util.Scanner;
class Positive
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check Whether it is positive or negative\n");
		int num=sc.nextInt();
		if (num>=0) 
		{
		    System.out.println("Your Number is Positive");	
		}
		else
		{
            System.out.println("Your Number is Negative");
		}
	}
}