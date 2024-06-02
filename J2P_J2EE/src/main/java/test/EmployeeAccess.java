package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeAccess {
	public Employee getSalary(String name) throws ClassNotFoundException, SQLException {
		Employee e=new Employee();
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/mydb";
		Connection con=DriverManager.getConnection(url,"root","root");
		
		String sql="select salary from Employee where name=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, name);
		ResultSet rs=pstmt.executeQuery();
		int salary=0;
		while (rs.next()) {
			salary=rs.getInt(1);
		}
		e.setName(name);
		e.setSalary(salary);
		System.out.println(name);
		System.out.println(salary);
		return e;
			
		
	}
}
