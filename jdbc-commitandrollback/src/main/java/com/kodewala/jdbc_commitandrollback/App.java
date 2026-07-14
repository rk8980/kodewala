package com.kodewala.jdbc_commitandrollback;

import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        Transaction transaction = new Transaction();
        transaction.doTransaction();
    
    }
}
