package uuu.mybuy.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	static final String Driver = "com.mysql.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/totalbuy?zeroDateTimeBehavior=convertToNull&characterEncoding=utf-8";
	static final String userId = "root";
	static final String pwd = "root1234";

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(url, userId, pwd);){
			System.out.println("連線成功！");
		} catch (SQLException e) {
			System.out.println("資料庫連線失敗");
		}

	}

}
