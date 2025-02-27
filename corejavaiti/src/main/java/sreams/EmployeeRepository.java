package sreams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeRepository {
    List<Employee> employeeList = new ArrayList<>();

    public EmployeeRepository() {
        employeeList.add(new Employee(1, "Ahmed", 200000.0));
        employeeList.add(new Employee(2, "Mohamed", 400000.0));
        employeeList.add(new Employee(3, "Ibrahim", 300000.0));

    }

    public Employee findById(Integer id) {
        Employee employee = null;
        Iterator<Employee> i = employeeList.iterator();
        while (i.hasNext()) {
            employee = i.next();
            if (employee.getId() == id) {
                break;
            }
        }
        return employee;

    }
}
