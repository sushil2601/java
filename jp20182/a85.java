class test
{
public static void main(String s[])
{

abc a1=new abc();
a1.show();

xyz b1=new xyz();
b1.display();
b1.show();


abc a2=b1;
a2.show(); 
a2.display(); //error

}
}

/*
Super class reference may refer to sub class object but it will only refer to inhertited sub-object of that class. So in that case, super class reference can only access members inherited from that super class.
*/