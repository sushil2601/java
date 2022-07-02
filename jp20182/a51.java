class abc
{
public static void main(String s[])
{

distance d1=new distance(4,5);
distance d2=new distance(2,3);
d1.show();//4'5"
d2.show();//2'3"

d1.test(d2); 
//ref of d2 is passed to function

d1.show(); //4'5"
d2.show(); //9'1"


d2.test(d1);
d1.show();//9'1"
d2.show();//9'1"

d2.xyz(d1);
d1.show();//10'7 
d2.show();//6'8" 

}
}

/*

Objects are always passed by reference in Java

*/