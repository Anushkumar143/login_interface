
package com.set.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    static String USERNAME = "SCOTT";
    static String PASSWORD = "TIGER";

    public static Connection getConnection() throws Exception {
        Class.forName(DB_DRIVER);
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
