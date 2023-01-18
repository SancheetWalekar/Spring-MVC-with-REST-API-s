package spring.example.spring_crud_app.controller;

import spring.example.spring_crud_app.model.Employee;
import spring.example.spring_crud_app.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Add new employee
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    // Add more than 1 employee
    @PostMapping("/addEmployees")
    public List<Employee> addAllEmployees(@RequestBody List<Employee> employees) {
        return employeeService.addAllEmployees(employees);
    }

    // Get employee by Id
    @GetMapping("/getEmployeeByID/{id}")
    public Employee getEmployeeById(@PathVariable long id) {
        return employeeService.getEmployeeByID(id);
    }

    // Get employee by name
    @GetMapping("/getEmployeeByName/{name}")
    public  Employee getEmployeeByName(@PathVariable String name) {
        return  employeeService.getEmployeeByName(name);
    }

    // Update employee
    @PutMapping("/updateEmployee")
    public Employee updateEMployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    // Delete employee
    @DeleteMapping("/deleteEmployeeById/{id}")
    public boolean deleteEmployeeByID(@PathVariable long id) {
        return employeeService.deleteEmployeeByID(id);
    }

    // Get all employee
    @GetMapping("/getAll")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployees();
    }
}
