class abc extends Exception
{



}

class xyz
{

public static void main(String s[]) throws abc
{

int x=Integer.parseInt(s[0]);

if(x>100)
 throw new abc();

System.out.println(x);


}

}