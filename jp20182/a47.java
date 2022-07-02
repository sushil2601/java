class abc
{
public static void main(String s[])
{

distance d1=new distance(4,5);
distance d2=d1;

d1.show();//4'5"
d2.show();//4'5"


d2.change(11,3);
d1.show(); //11'3"  
d2.show(); //11'3"  


d1=new distance(7,2);
d2.change(8,9);

d1.show();//7'2"
d2.show();//8'9"

d2=d1;

d1=null;
d2=null;


}
}

