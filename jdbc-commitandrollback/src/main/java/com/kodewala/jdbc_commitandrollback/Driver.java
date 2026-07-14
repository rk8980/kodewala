package com.kodewala.jdbc_commitandrollback;

import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		OrderMgmtPreparedSTtmt mgmtPreparedSTtmt = new OrderMgmtPreparedSTtmt();
		//mgmtPreparedSTtmt.updatePayment("blocked", 1);
		mgmtPreparedSTtmt.insertRecords();

	}

}
