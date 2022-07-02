class validation
{
static boolean isValidNumeric(String a)
{

if(a.length()==0)
return false;

char z[]=a.toCharArray();
for(int i=0;i<z.length;i++)
{
	if(z[i]<'0' || z[i]>'9')
	return false;

}


return true;
}

static boolean isValidPincode(String a)
{

if(a.length()!=6)
return false;

if(a.startsWith("0"))
return false;

char z[]=a.toCharArray();
for(int i=0;i<z.length;i++)
{
	if(z[i]<'0' || z[i]>'9')
	return false;

}


return true;
}

static boolean isValidName(String a)
{

a=a.trim();

if(a.length()==0)
return false;

char z[]=a.toCharArray();
for(int i=0;i<z.length;i++)
{
	if(z[i]<'a' || z[i]>'z')
	  if(z[i]<'A' || z[i]>'Z')
	    if(z[i]!='.' && z[i]!=' ')
		return false;	
	
}

if(a.indexOf("..")!=-1)
  return false;

if(a.startsWith("."))
  return false;


return true;
}

}


