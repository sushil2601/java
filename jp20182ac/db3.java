import java.sql.*;

class db3
{

public static void main(String s[]) throws Exception
{

String a,b,c;

a="109";
b="sham";
c="97.5";

Class.forName("com.mysql.jdbc.Driver");

String str="jdbc:mysql://localhost/jp20182";

Connection x=DriverManager.getConnection(str,"root","");

String query="insert into student values(?,?,?)";

PreparedStatement ps=x.prepareStatement(query);

ps.setString(1,a);
ps.setString(2,b);
ps.setString(3,c);

ps.executeUpdate();

System.out.println("Student inserted");

x.close();


}

}