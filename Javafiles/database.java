//java/jdk/lib/ext to add jdbc driver for that database
class Datebase
{
	static Connection con;
	static Statement stmt;
	Database()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306//")

		}
	}
}