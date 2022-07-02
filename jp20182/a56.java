/*
"this" keyword is a reference inside the class to store the reference of 
calling object.
"this" is implicitly implemented in the class.
*/

import java.util.Scanner;
class distance
{
int ft,inch;
distance()
{
ft=0;
inch=0;
}

distance(int a,int b)
{
ft=a;
inch=b;
}

void show()
{
System.out.println(this.ft+"'"+this.inch+"\"");
System.out.println(ft+"'"+inch+"\"");
}

}