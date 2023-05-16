-- GROUP BY  : 
SELECT
    C1,
    C2,
    C3...CN,
    aggregate_function(ci)
FROM
    table
WHERE
    where_condition
GROUP BY
    C1,
    C2,
    C3...Cn 
    -- Flow
    -- FROM -> WHERE -> GROUP BY -> SELECT -> DISTINCT -> ORDER BY -> LIMIT
    --
SELECT
    status
FROM
    orders
GROUP BY
    status;

--
SELECT
    DISTINCT status
FROM
    orders;

---
SELECT
    status,
    COUNT(*)
FROM
    orders
GROUP BY
    status;

--- Get the total amoun tof all order by status, join order table with orderdetails table
-- SUM 
SELECT
    status,
    SUM(quantityOrdered * priceEach) AS amount
FROM
    orders
    INNER JOIN orderdetails USING (orderNumber)
GROUP BY
    status;

-- Return the order numbers and the total amount of each order
SELECT
    orderNumber,
    SUM(quantityOrdered * priceEach) AS total
FROM
    orderdetails
GROUP BY
    orderNumber;

-- get the total sales for each year
SELECT
    YEAR(orderDate) AS year,
    SUM(quantityOrdered * priceEach) AS total
FROM
    orders
    INNER JOIN orderdetails USING (orderNumber)
WHERE
    status = "Shipped"
GROUP BY
    YEAR(orderDate);


-- GROUP BY WITH HAVING CLAUSE 
-- select the total sales of the years after 2003; 
SELECT
    YEAR(orderDate) AS year,
    SUM(quantityOrdered * priceEach) AS total
FROM
    orders
    INNER JOIN orderdetails USING (orderNumber)
WHERE
    status = "Shipped"
GROUP BY
    year
HAVING
    year > 2003;

-- total nuber of orders per year
SELECT
    year(orderDate) as YEAR,
    COUNT(orderNumber) AS Total
FROM
    orders
GROUP BY
    YEAR;

--status count
SELECT
    status,
    COUNT(*)
FROM
    orders
GROUP BY
    status;


-- HAVING 
-- FROM -> WHERE -> GROUP BY -> HAVING -> SELECT -> DISTINCT -> ORDER BY -> LIMIT



-- ROLLUP

-- MySQL ROLLUP clause to generate subtotals and grand totals.

/*
 Creates a new table named sales that stores the order values summarized by product lines and years.
 The data comes from the products, orders, and orderDetails tables
 */