import java.sql.SQLException;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {

        EmployeeDAO dao = new EmployeeDAOImpl();
        Employee mrKhan = new Employee(8, "Mr.", "Khan", "male", 40, 1);

        CityDao cityDao = new CityDAOImpl();

        List<Employee> employeesFromDubai = List.of(mrKhan);

        City beijing = new City("Beijing", employeesFromDubai);
        cityDao.add(beijing);

        City tokyo = new City("Tokyo");
        cityDao.add(tokyo);

        List<City> cityList = cityDao.readAll();


        for (City city : cityList) {
            System.out.println(city);
        }
        cityDao.getById(1);


        City vladivostok = new City(beijing.getCityId(), "Vladivostok");
        cityDao.updateCity(vladivostok);

        for (City city : cityList) {
            System.out.println(city);
        }

        cityDao.deleteCity(vladivostok);
        for (City city: cityList) {
          System.out.println(city);}

//        EmployeeDAO dao = new EmployeeDAOImpl();
//        dao.addEmployee(new Employee(1,"John","Wick", "male", 40, 1));
//        System.out.println(dao.getEmployeeById(1));
//        dao.updateEmployee(new Employee(1,"John","Wick", "male", 41, 2));
//        System.out.println(dao.getEmployeeById(2));
////        dao.deleteEmployee(new Employee(2,"John","Wick", "male", 41, 2));
//        System.out.println(dao.getAllEmployees());

//        SessionFactory factory = SessionUtils.getFactory();
//        EntityManager entityManager = SessionUtils.withEntityManager();
//        HibernateManager hibernateManager = new HibernateManager();
//
//        hibernateManager.withEntityManager(em -> {
//            Author author = new Author();
//            author.setFirstName("first name");
//            author.setLastName("last name");
//
//            Book book = new Book();
//            book.setISBN("123");
//            book.setAuthor(author);
//            book.setTitle("Title");
//            book.setYear(1999);
////            em.persist(book);
//            em.persist(author);
//            author.getBooks().add(book);
//        });
//
//        hibernateManager.withEntityManager(em -> {
//            Book bookFromDB = em.find(Book.class, "123");
//            System.out.println(bookFromDB.getISBN());
//            System.out.println(bookFromDB.getAuthor().getFirstName() + "" + bookFromDB.getAuthor().getLastName());
//        });
//
//        hibernateManager.withEntityManager(em -> {
//            Book bookFromDB = em.find(Book.class, "123");
//            bookFromDB.setYear(1990);
////            bookFromDB.setAuthor(author);
//        });
//
//        hibernateManager.withEntityManager(em -> {
//            Book bookFromDB = em.find(Book.class, "123");
//            System.out.println(bookFromDB.getAuthor());
//            System.out.println(bookFromDB.getTitle());
//            System.out.println(bookFromDB.getYear());
//        });


//        final String user = "postgres";
//        final String password = "epsonstylusc86";
//        final String url = "jdbc:postgresql://localhost:5432/skypro";
//        try (final Connection connection = DriverManager.getConnection(url, user, password)) {
//            PreparedStatement statement = connection.prepareStatement("SELECT first_name AS Name, " +
//                    "last_name AS Surname, " +
//                    "gender AS Gender, " +
//                    "city_name AS City " +
//                    "FROM employee " +
//                    "INNER JOIN city " +
//                    "ON employee.city_id = city.city_id WHERE id = (?);");
//            statement.setInt(1, 1);
//            final ResultSet resultSet = statement.executeQuery();
//
//            while (resultSet.next()) {
//                System.out.println("Name: " + resultSet.getString("Name"));
//                System.out.println("Surname: " + resultSet.getString("Surname"));
//                System.out.println("Gender: " + resultSet.getString("Gender"));
//                System.out.println("City: " + resultSet.getString("City"));
//                System.out.println("==================");
//            }
//
//            EmployeeDAO dao = new EmployeeDAOImpl(connection);
//
//            Employee mrKhan = new Employee(8, "Mr.", "Khan", "male", 40, 1);
//            Employee mrKhanPlus = new Employee(8, "Mr.", "KhanPlus", "robot", 100, 1);
//            dao.addEmployee(mrKhan);
//            System.out.println(dao.getEmployeeById(8));
//
//            System.out.println(dao.getAllEmployees());
//
//            dao.updateEmployeeById(8, mrKhanPlus);
//            System.out.println(dao.getAllEmployees());
//
//            dao.deleteEmployeeById(8);
//            System.out.println(dao.getAllEmployees());
//        }catch (SQLException e){
//            e.printStackTrace();
//        }

    }
}
