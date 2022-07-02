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
System.out.println("DC of xyz");
}

xyz(int d)
{
System.out.println("PC of xyz");
}

}