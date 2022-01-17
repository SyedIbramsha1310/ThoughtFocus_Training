package com.thoughtfocus;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;

public class DAO {
	DTO dto = new DTO();

	public void createTable1(Connection connection) {
		String createTable = DTO.getCreateyTableQuery();

		try (Statement statement = connection.createStatement();) {

			statement.execute(createTable);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertIntoTable1(Connection connection, int id, String Type, int price, String brandname, int quantity,
			int serailNumber) {
		String insertDataQuery = DTO.getInsertDataQuery();

		try (PreparedStatement preparedStatement = connection.prepareStatement(insertDataQuery);) {

			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, Type);
			preparedStatement.setInt(3, price);
			preparedStatement.setString(4, brandname);
			preparedStatement.setInt(5, quantity);
			preparedStatement.setInt(6, serailNumber);
			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updatePriceByid(Connection connection, int price, int id) {
		String updatepriceByCountByid = dto.getPriceByBrand();
		try (PreparedStatement preparedStatement = connection.prepareStatement(updatepriceByCountByid);) {

			preparedStatement.setInt(1, price);
			preparedStatement.setInt(2, id);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteBytype(Connection connection, int serialNo) {
		String deleteBytype = DTO.getDeleteBytype();
		try (PreparedStatement preparedStatement = connection.prepareStatement(deleteBytype);) {

			preparedStatement.setInt(1, serialNo);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void getAll(Connection connection) {
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		try {
			String getall = null;
			pstmt = connection.prepareStatement(getall);
			resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				System.out.println("Name: " + resultSet.getString("name"));
				System.out.println("Type: " + resultSet.getString("type"));
				System.out.println("Brand: " + resultSet.getString("brandName"));
				System.out.println("Price : " + resultSet.getDouble("price"));
				System.out.println("Quantity: " + resultSet.getInt("quantity"));
				System.out.println("SerialNo: " + resultSet.getInt("serialNo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void getAllbyName(Connection connection, String name) {
		String query = "SELECT *  FROM Shop WHERE name=?";
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		try {
			pstmt = connection.prepareStatement(name);
			pstmt.setname(1, name);
			resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				System.out.println("Name: " + resultSet.getString("name"));
				System.out.println("Type: " + resultSet.getString("type"));
				System.out.println("Brand: " + resultSet.getString("brandName"));
				System.out.println("Price : " + resultSet.getDouble("price"));
				System.out.println("Quantity: " + resultSet.getInt("quantity"));
				System.out.println("SerialNo: " + resultSet.getInt("serialNo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
	}

	public void createTable(Connection connection) {
		// TODO Auto-generated method stub

	}

	public void insertIntoTable(Connection connection, int i, String string, int j, String string2, boolean b,
			boolean c, long l) {
		// TODO Auto-generated method stub

	}

	public void insertIntoTable(Connection connection, int i, String string, int j, String string2, int k, int l) {
		// TODO Auto-generated method stub

	}

}
