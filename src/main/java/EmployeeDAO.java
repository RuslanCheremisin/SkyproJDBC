import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    void addEmployee(Employee employee) throws SQLException;

    Employee getEmployeeById(int id) throws SQLException;

    List<Employee>getAllEmployees() throws SQLException;

    void updateEmployeeById(int id, Employee employee) throws SQLException;

    void deleteEmployeeById(int id) throws SQLException;
}
