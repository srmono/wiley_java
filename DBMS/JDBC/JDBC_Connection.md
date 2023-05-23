1. Connecting to MySQL database
-----------------------
# Approach 1:
package com.wiley.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
	public static void main(String[] args) {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			
			//connection string
			String url = "jdbc:mysql://localhost:3306/wileyclassic";
			String username = "root";
			String password = "password";
			
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			
			System.out.println("Connection Success");
			
			
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}
}

**********************************************************************
# Approach 2:

First, you need to import three classes: SQLException, DriverManager, 
and Connection from the java.sql.* package.

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
------
Second, you call the getConnection() method of the DriverManager class to get the Connection object. There are three parameters you need to pass to the getConnection() method:

url: the database URL in the form jdbc:subprotocol:subname. For MySQL, you use the jdbc:mysql://localhost:3306/mysqljdbc i.e., you are connecting to the MySQL with server name localhost, port 3006, and database mysqljdbc.
user: the database user that will be used to connect to MySQL.
password: the password of the database user.


Connection conn = null;
try {
    // db parameters
    String url       = "jdbc:mysql://localhost:3306/mysqljdbc";
    String user      = "root";
    String password  = "secret";
	
    // create a connection to the database
    conn = DriverManager.getConnection(url, user, password);
    // more processing here
    // ...	
} catch(SQLException e) {
   System.out.println(e.getMessage());
} finally {
	try{
           if(conn ! null)
             conn.close()
	}catch(SQLException ex){
           System.out.println(ex.getMessage())
	}
}


When connecting to MySQL, anything could happens e.g., database server is not available, wrong user name or password, etc. in such cases, JDBC throws a SQLException . Therefore, when you create a Connection object, you should always put it inside a try catch block. Also you should always close the database connection once you complete interacting with database by calling close() method of the Connection object.


**********************************************************************************

# Approach 3: 
From Java 7, there is another nice statement called try-with-resources that allows you to simplify the code:

// db parameters
String url       = "jdbc:mysql://localhost:3306/mysqljdbc";
String user      = "root";
String password  = "secret";

Connection conn = null;

try(conn = DriverManager.getConnection(url, user, password);) {
	// processing here
} catch(SQLException e) {
   System.out.println(e.getMessage());
}

It is automatically calls the close() method of the Connection object once program finishes. As you can see it’s cleaner and more elegant. However…

It is not secure as well as flexible when you hard coded the database parameters inside the code like above. In case you change the database server or password; you have to change the code, compile it again, which is not a good design.

************************************************************************

# Approach 4:

To avoid hard coding all the database parameters in the code, you can use a Java properties file to store them. In case of changes, you just need to change them in the properties file and you don’t have to recompile the code.

Let’s take a look at the properties file named db.properties:

# MySQL DB parameters
user=root
password=secret
url=jdbc:mysql://localhost:3306/mysqljdbc

- You can rewrite the code for creating a Connection object with parameters from a properties file as follows:

Connection conn = null;

try(FileInputStream f = new FileInputStream("db.properties")) {
    // load the properties file
    Properties pros = new Properties();
    pros.load(f);

    // assign db parameters
    String url       = pros.getProperty("url");
    String user      = pros.getProperty("user");
    String password  = pros.getProperty("password");
    // create a connection to the database
    conn = DriverManager.getConnection(url, user, password);
} catch(IOException e) {
   System.out.println(e.getMessage());
} finally {
    try{
        if(conn != null)
            conn.close();
    }catch(SQLException ex){
        System.out.println(ex.getMessage());
    }
    
}

****************************************************************************

# Approach 5:
For each interaction with MySQL database, you need to create a new connection. You would have the same piece of code for doing this in all places. Rather than doing this, you can create a new class for handing connection creation:

