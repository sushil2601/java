class test
{
public static void main(String s[])
{

xyz t=new xyz();
t.show();
t.k(35);
t.f();
t.z();

abc p=new xyz();
p.show(); //error
p.k(35);
p.f();
p.z(); //error


abc1 p1=new xyz();
p1.show(); //error
p1.k(35);//error
p1.f();//error
p1.z();

}
}