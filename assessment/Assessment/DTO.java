package com.thoughtfocus;

public class DTO {
	private static String createyTableQuery;
	private static String insertDataQuery;
	private static String updatepricebyid;
	private static String deleteBytype;

	public static String getCreateyTableQuery() {
		return createyTableQuery;
	}

	public static void setCreateyTableQuery(String createyTableQuery) {
		DTO.createyTableQuery = createyTableQuery;
	}

	public static String getUpdatepricebyid() {
		return updatepricebyid;
	}

	public static void setUpdatepricebyid(String updatepricebyid) {
		DTO.updatepricebyid = updatepricebyid;
	}

	public static String getInsertDataQuery() {
		return insertDataQuery;
	}

	public static String getDeleteBytype() {
		return deleteBytype;
	}

	public void setCreateTableQuery(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setInsertDataQuery(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setUpdatePriceByid(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setDeleteBytype(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getPriceByBrand() {
		// TODO Auto-generated method stub
		return null;
	}

}
