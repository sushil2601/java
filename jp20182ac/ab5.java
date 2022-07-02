class InvalidMarksException extends Exception
{
String x;

InvalidMarksException(String x)
{
this.x=x;
}

public String toString()
{
return x;
}

}

