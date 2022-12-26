import java.util.Scanner;
public class Capital {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s= sc.nextLine();
		char[] ch= s.toCharArray();
		boolean space = true;
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) 
			{
				if (space) {
					ch[i] = Character.toUpperCase(ch[i]);
					space = false;
				}
			}

			else {
				   space = true;
			}
		}
		System.out.println("After Converting as Capital : ");
		 String str=new String(ch); 
		 System.out.println(str);
	}
}