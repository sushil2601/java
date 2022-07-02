import java.sql.*;

class db1
{

public static void main(String s[]) throws Exception
{

Class.forName("com.mysql.jdbc.Driver");

String str="jdbc:mysql://localhost/jp20182";

Connection x=DriverManager.getConnection(str,"root","");

System.out.println("Connection established");

x.close();


}

}