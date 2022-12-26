import java.util.*;
public class Sequence
{
    public static void main(String[] args)
    {
        System.out.println(" To check a string contains specified charvalues\n");
        Scanner sc=new Scanner(System.in);
        String s1= "Welcome To Carrertuner ";
        System.out.println("given string is : \n"+s1);
        System.out.println("Enter the String Which Needs To Be Checked :\n");
        String s2= sc.nextLine();
        System.out.println(s1.contains(s2));
    }
}