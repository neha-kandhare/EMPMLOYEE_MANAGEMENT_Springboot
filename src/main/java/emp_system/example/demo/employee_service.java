package emp_system.example.demo;

import java.util.List;

public interface employee_service {
    public String createemployee(employee_details employee);
    public String updateemployee(employee_details employee);
    public String getemployee(String employee);
    public String deleteemployee(String employee);
    public List<employee_details> getallemployeedetails();
}