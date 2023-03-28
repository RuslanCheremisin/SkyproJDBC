import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    private Connection connection;

//    public EmployeeDAOImpl(Connection connection) {
//        this.connection = connection;
//    }

    @Override
    public void addEmployee(Employee employee) {

        try(Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        }
//        PreparedStatement statement = connection.prepareStatement("INSERT INTO employee (id, first_name, last_name, gender, age, city_id)" +
//                "VALUES ((?), (?), (?), (?), (?), (?));");
//        statement.setInt(1, employee.getId());
//        statement.setString(2, employee.getFirst_name());
//        statement.setString(3, employee.getLast_name());
//        statement.setString(4, employee.getGender());
//        statement.setInt(5, employee.getAge());
//        statement.setInt(6, employee.getCityId());
//        statement.executeUpdate();


    }

    @Override
    public void updateEmployee(Employee employee) {
        try(Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        }
    }

    @Override
    public void deleteEmployee(Employee employee) {
        try(Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.delete(employee);
            transaction.commit();
        }
    }

    @Override
    public Employee getEmployeeById(int id) {
        return HibernateSessionFactoryUtils.getSessionFactory().openSession().get(Employee.class, id);
//        Employee employee = new Employee();
//
//        PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee WHERE id = (?);");
//        statement.setInt(1, id);
//        ResultSet resultSet = statement.executeQuery();
//        while (resultSet.next()) {
//            employee.setId(resultSet.getInt(1));
//            employee.setFirst_name(resultSet.getString(2));
//            employee.setLast_name(resultSet.getString(3));
//            employee.setGender(resultSet.getString(4));
//            employee.setAge(resultSet.getInt(5));
//            employee.setCityId(resultSet.getInt(6));
//        }
//        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() throws SQLException {
        return (List<Employee>) HibernateSessionFactoryUtils
                .getSessionFactory()
                .openSession()
                .createQuery("From Employee")
                .list();

//        List<Employee> employees = new ArrayList<>();
//
//        PreparedStatement statement = connection.prepareStatement(
//                "SELECT * FROM employee;");
//        ResultSet resultSet = statement.executeQuery();
//        while (resultSet.next()) {
//            Employee employee = new Employee();
//            employee.setId(resultSet.getInt(1));
//            employee.setFirst_name(resultSet.getString(2));
//            employee.setLast_name(resultSet.getString(3));
//            employee.setGender(resultSet.getString(4));
//            employee.setAge(resultSet.getInt(5));
//            employee.setCityId(resultSet.getInt(6));
//            employees.add(employee);
//        }
//
//        return employees;
    }

    @Override
    public void updateEmployeeById(int id, Employee employee) throws SQLException {



//        PreparedStatement statement = connection.prepareStatement("UPDATE employee " +
//                "SET first_name = (?), last_name = (?), age = (?), city_id = (?) WHERE id = (?);");
//        statement.setString(1, employee.getFirst_name());
//        statement.setString(2, employee.getLast_name());
//        statement.setInt(3, employee.getAge());
//        statement.setInt(4, employee.getCityId());
//        statement.setInt(5, id);
//        statement.execute();

    }

    @Override
    public void deleteEmployeeById(int id) throws SQLException {

//        PreparedStatement statement = connection.prepareStatement("DELETE FROM employee " +
//                " WHERE id = (?);");
//        statement.setInt(1, id);
//        statement.execute();

    }
}
