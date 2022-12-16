import java.util.Scanner;
class Product
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Product_Id");
        int pid=sc.nextInt();
        System.out.println("Enter The Product Name");
        String pname=sc.next();
        System.out.println("Enter The Product price");
        int pprice=sc.nextInt();
        System.out.println("Enter The Product Category");
        String pcat=sc.next();
        System.out.println("Enter The Brand of the Product");
        String pbrnd=sc.next();
        System.out.println("\n The product details are :");
        System.out.println("Product_Id :" +pid);
        System.out.println("Product Name : " +pname);
        System.out.println("Product price is :" +pprice);
        System.out.println("Product Category is :" +pcat);
        System.out.println("Product Brand is :" +pbrnd);
     }
}