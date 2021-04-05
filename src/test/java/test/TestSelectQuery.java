package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelectQuery {
        public static void main(String[] args) {
            Connection con = null;
            Statement stmt = null;
            ResultSet result = null;

            try {
                Class.forName("org.hsqldb.jdbc.JDBCDriver");
                con = DriverManager.getConnection(
                        "jdbc:hsqldb:file:bank_db", "root", "pswd");
                stmt = con.createStatement();
                result = stmt.executeQuery(
                        "SELECT FIRSTNAME, LASTNAME FROM CLIENT");

                System.out.println(result);

                while(result.next()){
                    System.out.println(
                            result.getString("FIRSTNAME")+" | "+
                            result.getString("LASTNAME"));
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
    }

