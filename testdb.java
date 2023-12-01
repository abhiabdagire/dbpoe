import java.sql.*;

class testdb {
    public static void main(String args[]) {
        int rn = 0;
        String name;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/stud", "root", "root");
            // here stud is database name, first root is username and second root is
            // password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");
            while (rs.next()) {
                rn = rs.getInt(1);
                name = rs.getString(2);
                System.out.println(“Rollno:”+rn+ “\t”+ “Name:”+nm);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Steps :

// 1. Open Terminal
// 2. Open MySQL prompt using
// mysql –u root –p
// Give password
// 3. create database stud;
// 4. use database stud;
// 5. create table student(rollno int, name varchar(20));
// 6. insert into student values(1, “Ram”);
// Insert into student values (2, “Krishna”);
// 7. Open another Terminal
// 8. Install MySQL Library using following command
// sudo apt-get install libmysql-java
// 9. Set Path to MySQL Library
// export CLASSPATH=$CLASSPATH:/usr/share/java/mysql-connector-java.jar
// 10. Compile java program
// javac testdb.java
// 11. Execute java program
// java testdb