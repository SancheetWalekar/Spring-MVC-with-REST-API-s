package spring.example.spring_crud_app.repository;


import spring.example.spring_crud_app.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee getByName(String name);

    Employee findByName(String name);
}
