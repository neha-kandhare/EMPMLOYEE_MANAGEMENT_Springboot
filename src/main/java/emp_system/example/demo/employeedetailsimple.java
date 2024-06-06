package emp_system.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class employeedetailsimple implements employee_service{
    employee_details_repo repo;
    public employeedetailsimple(employee_details_repo repo){
        this.repo = repo;
    }

    @Override
    public String createemployee(employee_details employee){
        repo.save(employee);
        return "Successfully saved the employee details";
    }

    @Override
    public String updateemployee(employee_details employee){
        repo.save(employee);
        return "Successfully updated the employee details";
    }

    @Override
    public String getemployee(String employeeid){
        repo.findById(employeeid).get();
        return "Successfully fetched the employee details";
    }

    @Override
    public String deleteemployee(String employeeid){
        repo.deleteById(employeeid);
        return "Successfully deleted the employee details";
    }

    @Override
    public List<employee_details> getallemployeedetails(){
        return repo.findAll();
    }
}