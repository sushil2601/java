/*
Calling super class constructor from sub class constructor
*/
class abc
{
abc()
{
System.out.println("DC of abc");
}

abc(int a)
{
System.out.println("PC of abc");
}
}

class xyz extends abc
{

xyz()
{
super(67);
System.out.println("DC of xyz");
}

xyz(int d)
{
super(34);
System.out.println("PC of xyz");
}

}