package com.thoughtfocus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.h2.tools.Server;



public class StationeryShop {
	public static void main(String[] args) {
		DTO dto = new DTO();

		dto.setCreateTableQuery(
				"CREATE TABLE Shop (id INT PRIMARY KEY,Type VARCHAR(20),price INT,brandname VARCHAR(20),quantity INT,serailNumber INT)");

		dto.setInsertDataQuery("INSERT INTO Shop VALUES (?,?,?,?,?,?)");

		dto.setUpdatePriceByid("UPDATE Shop SET price=? WHERE id=?");

		dto.setDeleteBytype("DELETE FROM Shop WHERE type=?");

		Connection connection = getConnection();

		DAO dao = new DAO();

		dao.createTable(connection);

		dao.insertIntoTable(connection, 100, "Paper", 100, "Papersoft", 100, 1);
		dao.insertIntoTable(connection, 101, "pen", 500, "Hero", 500, 2);


		try {
			Server.startWebServer(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:h2:mem:MobileApplication", "sa", "sa");
			if (con != null) {
				System.out.println("Connection acquired successfully");
			} else {
				System.out.println("No connection established");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}
}
