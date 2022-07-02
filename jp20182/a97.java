class test
{
public static void main(String s[])
{

rect r1=new rect(20,3);
r1.show();
r1.area();

circle c1=new circle(10.5f);
c1.display();
c1.area();

shape s1;
s1=r1;
s1.area();

s1=c1;
s1.area();

}
}