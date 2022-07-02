class abc
{

abc(int a)
{
System.out.println("PC of abc");
}
}

class xyz extends abc
{

xyz()
{
super(56);
System.out.println("DC of xyz");
}

xyz(int d)
{
super(34);
System.out.println("PC of xyz");
}

}