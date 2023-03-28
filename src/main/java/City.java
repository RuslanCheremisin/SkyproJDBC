import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cityId")
    private int cityId;

    @Column(name = "cityName")
    private String cityName;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<Employee> employees;


    public City(int cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }

    public City(int cityId, String cityName, List<Employee> employees) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.employees = employees;
    }

    public City(String cityName, List<Employee> employees) {
        this.cityName = cityName;
        this.employees = employees;
    }

    public City() {
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int city_id) {
        this.cityId = city_id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String city_name) {
        this.cityName = city_name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "City{" +
                "city_id=" + cityId +
                ", city_name='" + cityName + '\'' +
                ", employees=" + employees +
                '}';
    }
}