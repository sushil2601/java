class abc
{
public static void main(String s[])
{

String s1="thIsisHisDEcisioN"; 

char x;
int c=0;

for(int i=0;i<s1.length();i++)
{
  x=s1.charAt(i);
  if(x>='A' && x<='Z')
	c++;

}

System.out.println(c);

}
}
