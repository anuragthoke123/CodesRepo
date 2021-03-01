import java.sql.*;

public class Jdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cocktails","root","Anur@g17");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from Garnishes");
		
		while(rs.next())
		{
			String cockName = rs.getString("Cocktail_name");
			String garnish = rs.getString("Garnish");
			String meth = rs.getString("method");
			System.out.println(cockName+" "+" "+garnish+""+meth);
		}
		
	}

}
