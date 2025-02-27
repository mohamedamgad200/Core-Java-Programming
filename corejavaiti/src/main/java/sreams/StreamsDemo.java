package sreams;

import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        Integer[] empId = {1, 2, 3};
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Employee>employeeList= Stream.of(empId).map(employeeRepository::findById).toList();
        System.out.println(employeeList);

    }
}
