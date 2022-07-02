class abc
{
public static void main(String s[])
{

int x[][]={{2,3,4,5},{10,2,3,4},{32,1,2,5},{11,23,5,43}};

int t;

for(int i=0;i<x.length-1;i++)
{
  for(int j=i+1;j<x[i].length;j++)
  {	
		t=x[i][j];
		x[i][j]=x[j][i];
		x[j][i]=t;	
  }
}


for(int i=0;i<x.length;i++)
{
	for(int j=0;j<x[i].length;j++)
	{
		System.out.print(x[i][j]+"\t");
	}
	System.out.println();
}

}
}