/**
 * Create table If Not Exists Customers (Id int, Name varchar(255))
 * Create table If Not Exists Orders (Id int, CustomerId int)
 * Truncate table Customers
 * insert into Customers (Id, Name) values ('1', 'Joe')
 * insert into Customers (Id, Name) values ('2', 'Henry')
 * insert into Customers (Id, Name) values ('3', 'Sam')
 * insert into Customers (Id, Name) values ('4', 'Max')
 * Truncate table Orders
 * insert into Orders (Id, CustomerId) values ('1', '3')
 * insert into Orders (Id, CustomerId) values ('2', '1')
 * <p>
 * <p>
 * Suppose that a website contains two tables, the Customers table and the Orders table. Write a SQL query to find all customers who never order anything.
 * Table: Customers.
 * +----+-------+
 * | Id | Name  |
 * +----+-------+
 * | 1  | Joe   |
 * | 2  | Henry |
 * | 3  | Sam   |
 * | 4  | Max   |
 * +----+-------+
 * <p>
 * Table: Orders.
 * +----+------------+
 * | Id | CustomerId |
 * +----+------------+
 * | 1  | 3          |
 * | 2  | 1          |
 * +----+------------+
 * <p>
 * Using the above tables as example, return the following:
 * +-----------+
 * | Customers |
 * +-----------+
 * | Henry     |
 * | Max       |
 * +-----------+
 */
public class Task5 {
    String query = "SELECT Name as Customers" +
            "FROM Customers" +
            "WHERE Id NOT IN (SELECT CustomerId FROM Orders)";
}
