-- Let's Learn how to develop stored programs including stored procedures and stored functions in MySQL.


Stored procedure Fundamentals 
    - Introduction to Stored Procedures in MySQL 
    - Changing the default delimiter 
    - Creating new stored procedures 
    - Removing stored procedures 
    - Variables
    - Parameters 
    - Altering stored procedure 
    - Listing stored procedures 
Stored procedures with Conditional Statements
Stored procedures with Loops 
Stored procedures with Error Handling 
Stored procedures with Cursors 
Stored procedures with Stored Functions 
--------------------------------------------------------------
/*
What is Store Procedure?

A stored procedure is a prepared SQL code that you can save, 
so the code can be reused over and over again. So if you have an 
SQL query that you write over and over again, save it as a stored procedure, 
and then just call it to execute it. 

What is the execution process of Store procedure?

The first time you invoke a stored procedure, MySQL follows these steps:
    - MySQL looks up for the name in the database catalog
    - Compiles the stored procedure’s code
    - Place it in a memory area known as a cache
    - Execute the stored procedure

If you invoke the same stored procedure in the same session again, 
MySQL just executes the stored procedure from the cache without having to recompile it.

A stored procedure can have parameters so you can pass values to it 
and get the result back. For example, you can have a stored procedure that 
returns customers by country and city. In this case, the country and city 
are parameters of the stored procedure.

A stored procedure may contain control flow statements 
such as IF, CASE, and LOOP that allow you to implement the code in the procedural way.

A stored procedure can call other stored procedures or 
stored functions, which allows you to modulize your code.

---------------------------------------------
***MySQL stored procedures advantages
The following are the advantages of stored procedures.

- Reduce network traffic
Stored procedures help reduce the network traffic between applications and MySQL Server. Because instead of sending multiple lengthy SQL statements, applications have to send only the name and parameters of stored procedures.

- Centralize business logic in the database
You can use the stored procedures to implement business logic that is reusable by multiple applications. The stored procedures help reduce the efforts of duplicating the same logic in many applications and make your database more consistent.

- Make database more secure
The database administrator can grant appropriate privileges to applications that only access specific stored procedures without giving any privileges on the underlying tables.
---------------------------------------------
***MySQL stored procedures disadvantages
Besides those advantages, stored procedures also have disadvantages:

- Resource usages
If you use many stored procedures, the memory usage of every connection will increase substantially.

Besides, overusing a large number of logical operations in the stored procedures will increase the CPU usage because the MySQL is not well-designed for logical operations.

- Troubleshooting
It’s difficult to debug stored procedures. Unfortunately, MySQL does not provide any facilities to debug stored procedures like other enterprise database products such as Oracle and SQL Server.

- Maintenances
Developing and maintaining stored procedures often requires a specialized skill set that not all application developers possess. This may lead to problems in both application development and maintenance.

In this tutorial, you have learned about the MySQL stored procedures, their advantages, and disadvantages. Let’s move on to learn how to create a new stored procedure in MySQL.

*/
--------------------------------------------------------------

-- Return all rows in the table customers

SELECT 
    customerName, 
    city, 
    state, 
    postalCode, 
    country
FROM
    customers
ORDER BY customerName;

-- +-------------------------+--------------+-------+------------+-----------+
-- | customerName            | city         | state | postalCode | country   |
-- +-------------------------+--------------+-------+------------+-----------+
-- | Alpha Cognac            | Toulouse     | NULL  | 31000      | France    |
-- | American Souvenirs Inc  | New Haven    | CT    | 97823      | USA       |
-- | Amica Models & Co.      | Torino       | NULL  | 10100      | Italy     |
-- | ANG Resellers           | Madrid       | NULL  | 28001      | Spain     |
-- | Anna's Decorations, Ltd | North Sydney | NSW   | 2060       | Australia |
-- +-------------------------+--------------+-------+------------+-----------+
-- 5 rows in set (0.00 sec)



