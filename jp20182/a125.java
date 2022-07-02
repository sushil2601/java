class abc
{
public static void main(String s[])
{

String s1="thIsisHisDEcisioN"; 

char x[]=s1.toCharArray();
int c=0;

for(int i=0;i<s1.length();i++)
{
  if(x[i]>='A' && x[i]<='Z')
	c++;

}

System.out.println(c);

}
}
