import java.sql.*;

class db2
{

public static void main(String s[]) throws Exception
{

Class.forName("com.mysql.jdbc.Driver");

String str="jdbc:mysql://localhost/jp20182";

Connection x=DriverManager.getConnection(str,"root","");

String query="insert into student values(110,'ram',98)";

PreparedStatement ps=x.prepareStatement(query);

ps.executeUpdate();

System.out.println("Student inserted");

x.close();


}

}