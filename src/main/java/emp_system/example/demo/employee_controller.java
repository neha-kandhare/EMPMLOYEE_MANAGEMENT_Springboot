package emp_system.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee_details")
public class employee_controller {
    employee_service service;

    public employee_controller(employee_service service){
        this.service = service;
    }

    @GetMapping("{emplyeeid}")
    public String getemployeedetails(@PathVariable("employeeid")String employeeid){
        return service.getemployee(employeeid);
    }

    @GetMapping
    public List<employee_details> getallemployeedetails(){
        return service.getallemployeedetails();
    }

    @PostMapping
    public String createemployeedetails(@RequestBody employee_details employee){
        service.createemployee(employee);
        return "Created Successfully";
    }

    @PutMapping
    public String updateemployeedetails(@RequestBody employee_details employee){
        service.updateemployee(employee);
        return "Updated Successfully";
    }

    @DeleteMapping("{employeeid}")
    public String deleteemployeedetails(@PathVariable("employeeid") String employeeid){
        service.deleteemployee(employeeid);
        return "deleted Successfully";
    }
}