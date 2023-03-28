import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    private int id;
    @Column(length = 128)
    private String first_name;
    @Column(length = 128)
    private String last_name;
    @Column(length = 6)
    private String gender;
    private int age;

    private int cityId;



    public Employee(int id, String first_name, String last_name, String gender, int age, int cityId) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.cityId = cityId;
    }
//
//    public Employee(String first_name, String last_name, String gender, int age) {
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.gender = gender;
//        this.age = age;
//    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && age == employee.age && Objects.equals(first_name, employee.first_name) && Objects.equals(last_name, employee.last_name) && Objects.equals(gender, employee.gender);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, first_name, last_name, gender, age);
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", first_name='" + first_name + '\'' +
//                ", last_name='" + last_name + '\'' +
//                ", gender='" + gender + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
