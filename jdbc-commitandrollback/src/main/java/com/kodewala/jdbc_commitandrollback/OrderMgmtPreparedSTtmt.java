package com.kodewala.jdbc_commitandrollback;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderMgmtPreparedSTtmt {
	
	public void updatePayment(String status, int id) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Creating the connection with data.
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root",
						"root123");
				
				String updateQuery = "UPDATE payment SET status = ? WHERE id = ?";
				PreparedStatement ps = connection.prepareStatement(updateQuery);
				
				ps.setString(1, status);
				ps.setInt(2, id);
				
				
				int recordsUpdated = ps.executeUpdate();
				
				if (recordsUpdated > 0)
				{
					System.out.println("Records Updated" + recordsUpdated);
				}
				else
				{
					System.err.println("Unable to update the records");
				}
	}
	
	public void insertRecords() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/9th_march_2026", "root",
				"root123");
		
		String insertQuery = "insert into payment values(?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(insertQuery);
		
		connection.setAutoCommit(false);
		
		int batchSize = 10;
		
		for (int i = 10; i < 100; i++)
		{
			ps.setInt(1, i);
			ps.setString(2, "REFID" + i);
			ps.setString(3, "INIT");
			ps.addBatch();
			
			if (i % batchSize == 0)
			{
				System.out.println("executing query....");
				ps.executeBatch(); // only one db hit
				ps.clearBatch();
			}
			else
			{
				ps.executeBatch();
				connection.commit();
			}
		}
	}

}
