class test
{
public static void main(String s[])
{

abc a1=new abc();
a1.show(); //A

xyz b1=new xyz();
b1.display(); //B
b1.show(); //C


abc a2=b1;
a2.show(); //C


//a2.display(); //error

}
}

/*
All functions in Java are by default virtual.
*/
