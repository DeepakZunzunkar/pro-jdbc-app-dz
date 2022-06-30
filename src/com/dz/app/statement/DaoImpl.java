package com.dz.app.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.dz.app.utility.Utility;

public class DaoImpl {

	public static boolean create()
	{
		boolean status=true;
		Connection con=null;
		try {
			
			// get connection object 
			con=Utility.getMySqlConnection();
			Statement st=con.createStatement();
			
			//step 3:-write the query
			String q1="create table emp (eid int primary key auto_increment ,ename varchar(50),email varchar(50),age int,salary double)";
			
			//step 4:-execute the query
			status=st.execute(q1);
			
//			System.out.println(status);
			//step 5:close the resource
			con.close();
		} catch (Exception e) {
			
			System.err.println(e.getMessage());
//			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return status;
	}
}
