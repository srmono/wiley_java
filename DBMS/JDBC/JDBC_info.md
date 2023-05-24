# JDBC API provides a standard interface for interacting with any relational database management systems (RDBMS). JDBC API consists of the following main components:

- JDBC Driver
- Connection
- Statement
- ResultSet

## Let’s take a look at each component in more detail.

### JDBC Driver
- A JDBC driver is set of Java classes that implement JDBC interfaces for interacting with a specific database. Almost all database vendors such as MySQL, Oracle, Microsoft SQL Server, provide JDBC drivers. For example, MySQL provides a JDBC driver called MySQL Connection/J that allows you to work with MySQL database through a standard JDBC API.

- There are three types of JDBC drivers including JDBC-native API Driver, JDBC-net Driver, and JDBC Driver.

- We will discuss about the JDBC driver, for more detailed information on the other driver type, you can check it out the JDBC driver.

- JDBC Driver is written in pure Java. It translates JDBC calls into MySQL specific calls and sends the calls directly to a specific database. To use a JDBC driver, you need to include the driver JAR file with your application. MySQL Connector/J is the JDBC driver.

### Connection
- The first and most important component of JDBC is the Connection object. In a Java application, you first load a JDBC driver and then establish a connection to the database. Through the Connection object, you can interact with the database e.g., creating a Statement to execute SQL queries against tables. You can open more than one connection to a database at a time.

### Statement
- To execute a SQL query e.g., SELECT, INSERT, UPDATE, DELETE, etc., you use a Statement object. You create the Statement object through the Connection object. JDBC provides several types of statements for different purposes such as PreparedStatement , CallableStatement . We will cover the details of each object in the next tutorials.

### ResultSet
- After querying data from the database, you get a ResultSet object. The ResultSet object provides a set of API that allows you to traverse result of the query.

### The typical flow of using JDBC is as follows:

- First, load the JDBC driver and create a connection to the database.
Then, create a Statement and execute the query to get a ResultSet.
Next, traverse and process the ResultSet .
Close the ResultSet , Statement , and Connection .


## JDBC Architecture
The JDBC API supports both two-tier and three-tier processing models for database access but in general, JDBC Architecture consists of two layers −
- JDBC API − This provides the application-to-JDBC Manager connection.

- JDBC Driver API − This supports the JDBC Manager-to-Driver Connection.

The JDBC API uses a driver manager and database-specific drivers to provide transparent connectivity to heterogeneous databases.

The JDBC driver manager ensures that the correct driver is used to access each data source. The driver manager is capable of supporting multiple concurrent drivers connected to multiple heterogeneous databases.

## Common JDBC Components
The JDBC API provides the following interfaces and classes −

- DriverManager − This class manages a list of database drivers. Matches connection requests from the java application with the proper database driver using communication sub protocol. The first driver that recognizes a certain subprotocol under JDBC will be used to establish a database Connection.

- Driver − This interface handles the communications with the database server. You will interact directly with Driver objects very rarely. Instead, you use DriverManager objects, which manages objects of this type. It also abstracts the details associated with working with Driver objects.

- Connection − This interface with all methods for contacting a database. The connection object represents communication context, i.e., all communication with database is through connection object only.

- Statement − You use objects created from this interface to submit the SQL statements to the database. Some derived interfaces accept parameters in addition to executing stored procedures.

- ResultSet − These objects hold data retrieved from a database after you execute an SQL query using Statement objects. It acts as an iterator to allow you to move through its data.

- SQLException − This class handles any errors that occur in a database application.

## The JDBC 4.0 Packages
The java.sql and javax.sql are the primary packages for JDBC 4.0. This is the latest JDBC version at the time of writing this tutorial. It offers the main classes for interacting with your data sources.

The new features in these packages include changes in the following areas −

- Automatic database driver loading.
- Exception handling improvements.
- Enhanced BLOB/CLOB functionality.
- Connection and statement interface enhancements.
- National character set support.
- SQL ROWID access.
- SQL 2003 XML data type support.
- Annotations


## Creating JDBC Application
There are following six steps involved in building a JDBC application −

- Import the packages − Requires that you include the packages containing the JDBC classes needed for database programming. Most often, using import java.sql.* will suffice.

- Open a connection − Requires using the DriverManager.getConnection() method to create a Connection object, which represents a physical connection with the database.

- Execute a query − Requires using an object of type Statement for building and submitting an SQL statement to the database.

- Extract data from result set − Requires that you use the appropriate ResultSet.getXXX() method to retrieve the data from the result set.

- Clean up the environment − Requires explicitly closing all database resources versus relying on the JVM's garbage collection.

## JDBC Drivers Types
JDBC driver implementations vary because of the wide variety of operating systems and hardware platforms in which Java operates. Sun has divided the implementation types into four categories, Types 1, 2, 3, and 4

## Connections
The programming involved to establish a JDBC connection is fairly simple. Here are these simple four steps −

- Import JDBC Packages − Add import statements to your Java program to import required classes in your Java code.

```
import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support
```

- Register JDBC Driver − This step causes the JVM to load the desired driver implementation into memory so it can fulfill your JDBC requests.

```
try {
   Class.forName("oracle.jdbc.driver.OracleDriver");
}
```
- Database URL Formulation − This is to create a properly formatted address that points to the database to which you wish to connect.

```
RDBMS	JDBC driver name	URL format
MySQL	com.mysql.jdbc.Driver	jdbc:mysql://hostname/ databaseName
```

- Create Connection Object − Finally, code a call to the DriverManager object's getConnection( ) method to establish actual database connection.

String URL = "jdbc:mysql://hostname/databaseName";
String USER = "username";
String PASS = "password"
Connection conn = DriverManager.getConnection(URL, USER, PASS);

## Statements

- Statement	
Use this for general-purpose access to your database. Useful when you are using static SQL statements at runtime. The Statement interface cannot accept parameters.

- PreparedStatement	
Use this when you plan to use the SQL statements many times. The PreparedStatement interface accepts input parameters at runtime.

- CallableStatement	
Use this when you want to access the database stored procedures. The CallableStatement interface can also accept runtime input parameters.

## To execute an SQL statement with one of its three execute methods.

- boolean execute (String SQL): Returns a boolean value of true if a ResultSet object can be retrieved; otherwise, it returns false. Use this method to execute SQL DDL statements or when you need to use truly dynamic SQL.

- int executeUpdate (String SQL) − Returns the number of rows affected by the execution of the SQL statement. Use this method to execute SQL statements for which you expect to get a number of rows affected - for example, an INSERT, UPDATE, or DELETE statement.

- ResultSet executeQuery (String SQL) − Returns a ResultSet object. Use this method when you expect to get a result set, as you would with a SELECT statement.

##  ResultSet interface can be broken down into three categories −

- Navigational methods − Used to move the cursor around.

- Get methods − Used to view the data in the columns of the current row being pointed by the cursor.

- Update methods − Used to update the data in the columns of the current row. The updates can then be updated in the underlying database as well.


# Batch Processing

Batch Processing allows you to group related SQL statements into a batch and submit them with one call to the database.

- When you send several SQL statements to the database at once, you reduce the amount of communication overhead, thereby improving performance.

- JDBC drivers are not required to support this feature. You should use the DatabaseMetaData.supportsBatchUpdates() method to determine if the target database supports batch update processing. The method returns true if your JDBC driver supports this feature.

- The addBatch() method of Statement, PreparedStatement, and CallableStatement is used to add individual statements to the batch. The executeBatch() is used to start the execution of all the statements grouped together.

- The executeBatch() returns an array of integers, and each element of the array represents the update count for the respective update statement.

- Just as you can add statements to a batch for processing, you can remove them with the clearBatch() method. This method removes all the statements you added with the addBatch() method. However, you cannot selectively choose which statement to remove.


# Batching with Statement Object
Here is a typical sequence of steps to use Batch Processing with Statement Object −

- Create a Statement object using either createStatement() methods.

- Set auto-commit to false using setAutoCommit().

- Add as many as SQL statements you like into batch using addBatch() method on created statement object.

- Execute all the SQL statements using executeBatch() method on created statement object.

- Finally, commit all the changes using commit() method.

# Batching with PrepareStatement Object
Here is a typical sequence of steps to use Batch Processing with PrepareStatement Object −

- Create SQL statements with placeholders.

- Create PrepareStatement object using either prepareStatement() methods.

- Set auto-commit to false using setAutoCommit().

- Add as many as SQL statements you like into batch using addBatch() method on created statement object.

- Execute all the SQL statements using executeBatch() method on created statement object.

- Finally, commit all the changes using commit() method.


-------------------------------------------------

# Store procedure in wileyjdbc
```
DELIMITER $$
CREATE PROCEDURE get_candidate_skill(IN candidate_id INT)
BEGIN
	SELECT candidates.id, first_name,last_name, skills.name AS skill 
	FROM candidates
	INNER JOIN candidate_skills ON candidates.id = candidate_skills.candidate_id
	INNER JOIN skills ON skills.id = candidate_skills.skill_id
	WHERE candidates.id = candidate_id;
    END$$
DELIMITER ;
```

# Syntax	Stores Procedures
```
{  call procedure_name() }	    Accept no parameters and return no value
{ call procedure_name(?,?) }	Accept two parameters and return no value
{?= call procedure_name() }	    Accept no parameter and return value
{?= call procedure_name(?) }	Accept one parameter and return value
```


