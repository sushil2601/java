class abc 
{

public String toString()
{
return "hello";
}

}

class xyz
{

public static void main(String s[]) 
{

abc z=new abc();

String k=z.toString();

System.out.println(k);

System.out.println(z.toString());

System.out.println(z);

}

}


