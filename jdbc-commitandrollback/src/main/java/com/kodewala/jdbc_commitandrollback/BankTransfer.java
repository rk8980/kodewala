package com.kodewala.jdbc_commitandrollback;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BankTransfer {

    public void doBankTransfer(int balance, int id) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankdb",
                    "root",
                    "root123");

            con.setAutoCommit(false);

            String debit =
                    "update account set balance=balance-? where id=?";

            PreparedStatement ps1 = con.prepareStatement(debit);

            ps1.setInt(1,balance);
            ps1.setInt(2,id);

            ps1.executeUpdate();

            String credit =
                    "update account set balance=balance+? where id=?";

            PreparedStatement ps2 = con.prepareStatement(credit);

            ps2.setInt(1,balance);
            ps2.setInt(2,id);

            ps2.executeUpdate();

            con.commit();

            System.out.println("Money Transferred");

        } catch(Exception e){

            System.out.println("Transfer Failed");

        }

    }

}