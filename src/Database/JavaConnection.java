package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JavaConnection {
    
    public static Connection DB() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
            System.out.println("Connected successfully to database");
            CreateDatabase(conn);
            UseDatabase(conn);
            CreateUsersTable(conn);
            CreateRecordsTable(conn);
            CreatePaids(conn);
            return conn;
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
        
    }
    
    public static void CreateDatabase(Connection conn) {
        try (PreparedStatement pst = conn.prepareStatement("create database if not exists cars")) {
            pst.execute();
            System.out.println("Database created");
            pst.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void UseDatabase(Connection conn) {
        try (PreparedStatement pst = conn.prepareStatement("Use cars")) {
            pst.execute();
            System.out.println("using database");
            pst.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void CreateUsersTable(Connection conn) {
        try (PreparedStatement pst = conn.prepareStatement("Create table if not exists users("
                + "id int primary key auto_increment,"
                + "name varchar(255) not null,"
                + "username varchar(255) not null,"
                + "password varchar(255) not null,"
                + "phone varchar(255) not null,"
                + "location varchar(255) not null,"
                + "isVerified boolean"
                + ")")) {
            pst.execute();
            System.out.println("Created users table");
            pst.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void CreateRecordsTable(Connection conn) {
        String sql = "CREATE TABLE IF NOT EXISTS records ("
                + "id INT PRIMARY KEY AUTO_INCREMENT, "
                + "user_id INT NOT NULL, "
                + "name VARCHAR(255) NOT NULL, "
                + "price INT NOT NULL, "
                + "is_monthly BOOLEAN DEFAULT 0, "
                + "is_cash BOOLEAN DEFAULT 0,"
                + "is_paid BOOLEAN DEFAULT 0,"
                + "amount_paid decimal(10,2) DEFAULT 0.0"
                
                + ")";
        
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.execute();
            pst.close();
            System.out.println("Created 'records' table successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void CreatePaids(Connection conn) {
        String sql = "CREATE TABLE IF NOT EXISTS paids ("
                + "id INT PRIMARY KEY AUTO_INCREMENT, "
                + "user_id INT NOT NULL, "
                + "amount_paid decimal(10,2) DEFAULT 0.0"
                + ")";
        
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.execute();
            pst.close();
            System.out.println("Created 'paids' table successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
