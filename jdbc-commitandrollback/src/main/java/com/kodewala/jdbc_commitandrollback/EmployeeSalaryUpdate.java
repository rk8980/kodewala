package com.kodewala.jdbc_commitandrollback;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeSalaryUpdate {

    public void doSalaryUpdate(double salary, int id) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "root123");

            con.setAutoCommit(false);

            String query = "update employee set salary=? where id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            ps.executeUpdate();

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            ps.executeUpdate();

            con.commit();

            System.out.println("Transaction Successful");

        } catch (Exception e) {

            System.out.println("Transaction Failed");

        }
    }
}