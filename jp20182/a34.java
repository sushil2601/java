//Jagged array : which may have different no. of columns in different rows

class abc
{
public static void main(String s[])
{

int x[][]={{3,4,5,6},{10,2,19},{20,4,12,3,4}};

System.out.println("Array is:");

for(int i=0;i<x.length;i++)
{
  for(int j=0;j<x[i].length;j++)
   System.out.print(x[i][j]+"\t");

 System.out.println();
}

}
}

