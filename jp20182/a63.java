class abc
{
public static void main(String s[])
{

distance d1=new distance(10,2);
distance d2=new distance(5,3);

d1.show(); //10'3"
d2.show(); //5'3"

distance.display(); 
distance.inch=90;

d1.show(); //10'90"
}
}