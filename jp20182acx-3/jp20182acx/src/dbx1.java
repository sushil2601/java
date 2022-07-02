
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dbx1 {

public static void main(String s[]) throws Exception
{

String a,b,c;

Class.forName("com.mysql.jdbc.Driver");

String str="jdbc:mysql://localhost/jp20182";

Connection x=DriverManager.getConnection(str,"root","");

String query="select * from student";

PreparedStatement ps=x.prepareStatement(query);
ResultSet rs=ps.executeQuery();

while(rs.next())
{
a=rs.getString("roll");
b=rs.getString("name");
c=rs.getString("marks");
System.out.println(a+","+b+","+c);
}


x.close();


}
    
}
