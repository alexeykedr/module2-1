/**
 * Create table Person (PersonId int, FirstName varchar(255), LastName varchar(255))
 * Create table Address (AddressId int, PersonId int, City varchar(255), State varchar(255))
 * Truncate table Person
 * insert into Person (PersonId, LastName, FirstName) values ('1', 'Wang', 'Allen')
 * Truncate table Address
 * insert into Address (AddressId, PersonId, City, State) values ('1', '2', 'New York City', 'New York')
 *
 *
 * Write a SQL query for a report that provides the following information
 * for each person in the Person table, regardless if there is an address
 * for each of those people:
 * FirstName, LastName, City, State
 * */
public class Task1 {
    String query = "select p.FirstName, p.LastName, a.City, a.State" +
            "from Person p" +
            "left join Address a on p.PersonId = a.PersonId";
}
