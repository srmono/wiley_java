-- COMMON TABLE expression or CTE
-- CONSTRUCT COMPLEX queries IN A MORE READABLE MANNER
-- CTE  results only in execution scope 

WITH customers_in_usa AS (
    SELECT 
        customerName, state
    FROM 
        customers
    WHERE 
        country = 'USA'
) SELECT customerName FROM customers_in_usa WHERE state = 'CA' ORDER BY customerName;
