/*
JDBC API provides a standard interface for interacting with any relational database management systems (RDBMS). JDBC API consists of the following main components:

JDBC Driver
Connection
Statement
ResultSet
Let’s take a look at each component in more detail.

JDBC Driver
A JDBC driver is set of Java classes that implement JDBC interfaces for interacting with a specific database. Almost all database vendors such as MySQL, Oracle, Microsoft SQL Server, provide JDBC drivers. For example, MySQL provides a JDBC driver called MySQL Connection/J that allows you to work with MySQL database through a standard JDBC API.

There are three types of JDBC drivers including JDBC-native API Driver, JDBC-net Driver, and JDBC Driver.

We will discuss about the JDBC driver, for more detailed information on the other driver type, you can check it out the JDBC driver.

JDBC Driver is written in pure Java. It translates JDBC calls into MySQL specific calls and sends the calls directly to a specific database. To use a JDBC driver, you need to include the driver JAR file with your application. MySQL Connector/J is the JDBC driver.

Connection
The first and most important component of JDBC is the Connection object. In a Java application, you first load a JDBC driver and then establish a connection to the database. Through the Connection object, you can interact with the database e.g., creating a Statement to execute SQL queries against tables. You can open more than one connection to a database at a time.

Statement
To execute a SQL query e.g., SELECT, INSERT, UPDATE, DELETE, etc., you use a Statement object. You create the Statement object through the Connection object. JDBC provides several types of statements for different purposes such as PreparedStatement , CallableStatement . We will cover the details of each object in the next tutorials.

ResultSet
After querying data from the database, you get a ResultSet object. The ResultSet object provides a set of API that allows you to traverse result of the query.

The typical flow of using JDBC is as follows:

First, load the JDBC driver and create a connection to the database.
Then, create a Statement and execute the query to get a ResultSet.
Next, traverse and process the ResultSet .
Close the ResultSet , Statement , and Connection .
*/