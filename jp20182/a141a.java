import java.util.Scanner;

class abc
{
public static void main(String s[])
{
Scanner p=new Scanner(System.in);
System.out.println("Enter string: ");
String k=p.nextLine();

if(validation.isValidName(k))
System.out.println("Valid name");
else
System.out.println("Invalid name");

}
}