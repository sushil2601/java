class abc
{
public static void main(String s[])
{
int a,b,c;

a=Integer.parseInt(s[0]);
b=Integer.parseInt(s[1]);

c=a/b;

System.out.println(c);

System.out.println("Bye");


}
}

/*
java abc 10 5		2 Bye
java abc 10		AIOOBE
java abc		AIOOBE
java abc 10 0		AE
java abc 10 xy		NFE
*/